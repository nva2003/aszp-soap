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
    public ProjectsResponse getASZPProjects() {
        ProjectsResponse response = new ProjectsResponse();

        Map<String, Serializable> paramMap = new HashMap<String, Serializable>();


        List<Project> projects = new ArrayList<>();
        List<Indicator> projectIndicators = new ArrayList<>();
        List<IndicatorSummary> projectIndicatorsSummaries = new ArrayList<>();
        List<ProjectTree> projectSubprojects = new ArrayList<>();
        paramMap.put("skim", true);


            projects.addAll(projectMapper.getProjects(paramMap));

            for (Project project : projects) {

                paramMap.put("idProject", project.getIdProject());

                Project projectInfo = projectMapper.getProjectInfo(paramMap);

                paramMap.put("currency",projectInfo.getCurrency());

                projectIndicators.addAll(projectMapper.getProjectIndicators(paramMap));

                projectIndicatorsSummaries.addAll(projectMapper.getProjectIndicatorsSummaries(paramMap));

                projectSubprojects.addAll(projectMapper.getProjectSubprojects(paramMap));
            }


        response.setProjects(projects);
        if ( ! this.isEmpty(projects) ) {
            response.setIndicators(projectIndicators);
            response.setProjectTree(projectSubprojects);
//            response.setIndicatorsSummaries(projectIndicatorsSummaries);
        }

        return response;
    }

    private boolean isEmpty(List list ){
        boolean nullsOnly = list.stream().allMatch(Objects::isNull);
        return list.isEmpty() || nullsOnly;
    }
}
