package rzd.pktbcdt.aszp.soap.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rzd.pktbcdt.aszp.soap.ws.mapper.ProjectMapper;
import rzd.pktbcdt.aszp.soap.ws.model.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProjectsServiceImpl implements ProjectsService {

    @Autowired
    private ProjectMapper projectMapper;

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

    @Override
    public ProjectTreeResponse getProjectTree(ProjectTreeRequest request) {
        Map<String, Serializable> paramMap = new HashMap<String, Serializable>();
        paramMap.put("idProject", request.getIdProject());
        ProjectTreeResponse projectTree = new ProjectTreeResponse();
             projectTree.setProjectTree(projectMapper.getProjectSubprojects(paramMap));
         return projectTree;
    }

    @Override
    public ProjectsResponse getASZPProjects(ProjectsRequest request) {
        ProjectsResponse response = new ProjectsResponse();

        Map<String, Serializable> paramMap = new HashMap<String, Serializable>();
        //todo: add year or date paramMap.put("year", request.getYear());

        if (request.getIdProjectList() == null || request.getIdProjectList().isEmpty()){

            response.setProjects(projectMapper.getProjects(paramMap));
            List<Indicator> projectIndicators = projectMapper.getIndicators(paramMap);
            response.setIndicators(projectIndicators);
            response.setProjectTree(projectMapper.getProjectSub(paramMap));

        } else {
            List<Project> projects = new ArrayList<>();
            List<Indicator> projectIndicators = new ArrayList<>();
            List<ProjectTree> projectSubprojects = new ArrayList<>();

            for (Long idProject : request.getIdProjectList()) {

                paramMap.put("idProject", idProject);

                projects.add(projectMapper.getProjectInfo(paramMap));
                projectIndicators.addAll(projectMapper.getProjectIndicators(paramMap));
                projectSubprojects.addAll(projectMapper.getProjectSubprojects(paramMap));
            }

            response.setProjects(projects);
            response.setIndicators(projectIndicators);
            response.setProjectTree(projectSubprojects);

        }

        return response;
    }
}
