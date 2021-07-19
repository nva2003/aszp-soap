package rzd.pktbcdt.aszp.soap.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rzd.pktbcdt.aszp.soap.ws.mapper.ProjectMapper;
import rzd.pktbcdt.aszp.soap.ws.model.*;

import java.io.Serializable;
import java.util.*;

@Service
public class ProjectsServiceImpl implements ProjectsService {

    @Autowired
    private ProjectMapper projectMapper;

    @Deprecated
    @Override
    public ProjectInfoResponse getProjectInfo(ProjectInfoRequest request) {
        ProjectInfoResponse projectInfo = new ProjectInfoResponse();
        Map<String, Serializable> paramMap = new HashMap<String, Serializable>();
        paramMap.put("idProject", request.getIdProject());
        paramMap.put("year", request.getYear());

        Project projectsInfo = projectMapper.getProjectInfo(paramMap);
        List<Indicator> projectIndicators = projectMapper.getProjectIndicators(paramMap);

        if ( projectsInfo != null){
            projectInfo.setProject(projectsInfo);
            projectInfo.setIndicators(projectIndicators);
        }


        return projectInfo;
    }


    @Deprecated
    @Override
    public List<Project> getProjects(GetProjectsRequest request) {
        Map<String, Serializable> paramMap = new HashMap<String, Serializable>();
        paramMap.put("idProject", request.getIdProject());
        if (request.getDate() != null) {
            paramMap.put("date", new java.sql.Date(request.getDate().getTime()));
        }
         List<Project> projects = projectMapper.getProjects(paramMap);
         return projects;
    }

    @Deprecated
    @Override
    public ProjectTreeResponse getProjectTree(ProjectTreeRequest request) {
        Map<String, Serializable> paramMap = new HashMap<String, Serializable>();
        paramMap.put("idProject", request.getIdProject());
        ProjectTreeResponse projectTree = new ProjectTreeResponse();
        if ( request.getIdProject() == null ) {
            projectTree.setProjectTree(projectMapper.getProjectSub());
        } else {
            projectTree.setProjectTree(projectMapper.getProjectSubprojects(paramMap));
        }
        return projectTree;
    }

    @Override
    public ProjectsResponse getASZPProjects(ProjectsRequest request) {
        ProjectsResponse response = new ProjectsResponse();

        Map<String, Serializable> paramMap = new HashMap<String, Serializable>();
        //todo: add year or date paramMap.put("year", request.getYear());

        boolean nullsOnly = request.getIdProjectList().stream().allMatch(Objects::isNull);

        List<Project> projects = new ArrayList<>();
        List<Indicator> projectIndicators = new ArrayList<>();
        List<ProjectTree> projectSubprojects = new ArrayList<>();
        paramMap.put("skim", true);

        if (request.getIdProjectList() == null || request.getIdProjectList().isEmpty() || nullsOnly){


            projects.addAll(projectMapper.getProjects(paramMap));

            for (Project project : projects) {

                paramMap.put("idProject", project.getIdProject());
                projectIndicators.addAll(projectMapper.getProjectIndicators(paramMap));
                projectSubprojects.addAll(projectMapper.getProjectSubprojects(paramMap));
            }

        } else {

            for (Long idProject : request.getIdProjectList()) {

                paramMap.put("idProject", idProject);

                projects.add(projectMapper.getProjectInfo(paramMap));
                projectIndicators.addAll(projectMapper.getProjectIndicators(paramMap));
                projectSubprojects.addAll(projectMapper.getProjectSubprojects(paramMap));
            }


        }

        response.setProjects(projects);
        if ( ! this.isEmpty(projects) ) {
            response.setIndicators(projectIndicators);
            response.setProjectTree(projectSubprojects);
        }

        return response;
    }

    private boolean isEmpty(List list ){
        boolean nullsOnly = list.stream().allMatch(Objects::isNull);
        return list.isEmpty() || nullsOnly;
    }
}
