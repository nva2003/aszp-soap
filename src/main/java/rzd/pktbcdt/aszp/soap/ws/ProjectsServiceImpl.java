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

                Project projectInfo = projectMapper.getProjectInfo(paramMap);

                paramMap.put("currency",projectInfo.getCurrency());

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
