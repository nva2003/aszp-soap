package rzd.pktbcdt.aszp.soap.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rzd.pktbcdt.aszp.soap.ws.mapper.ProjectMapper;
import rzd.pktbcdt.aszp.soap.ws.model.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProjectsServiceImpl implements ProjectsService {

    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public ProjectInfoResponse getProjectsInfo(GetProjectsRequest request) {
        ProjectInfoResponse projectInfo = new ProjectInfoResponse();
        Map<String, Serializable> paramMap = new HashMap<String, Serializable>();
        paramMap.put("idProject", request.getIdProject());

        List<Project> projects = projectMapper.getProjects(paramMap);
        List<Risk> projectRisks = projectMapper.getProjectRisks(paramMap);
        List<Indicator> projectIndicators = projectMapper.getProjectIndicators(paramMap);

        projectInfo.setProject(projects.get(0));
        projectInfo.setRisks(projectRisks);
        projectInfo.setIndicators(projectIndicators);


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
}
