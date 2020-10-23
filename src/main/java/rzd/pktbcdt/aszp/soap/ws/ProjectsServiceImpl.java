package rzd.pktbcdt.aszp.soap.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rzd.pktbcdt.aszp.soap.ws.mapper.ProjectMapper;
import rzd.pktbcdt.aszp.soap.ws.model.GetProjectsRequest;
import rzd.pktbcdt.aszp.soap.ws.model.Project;
import rzd.pktbcdt.aszp.soap.ws.model.ProjectInfo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProjectsServiceImpl implements ProjectsService {

    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public List<ProjectInfo> getProjectsInfo(GetProjectsRequest request) {
        ProjectInfo projectInfo = new ProjectInfo();
        Map<String, Serializable> paramMap = new HashMap<String, Serializable>();
        paramMap.put("idProject", request.getIdProject());
        paramMap.put("year", request.getYear());

        List<?> projectIndicators = projectMapper.getProjectIndicators(paramMap);

        return null;
    }



    @Override
    public List<Project> getProjects(GetProjectsRequest request) {
        Map<String, Serializable> paramMap = new HashMap<String, Serializable>();
        paramMap.put("idProject", request.getIdProject());
        paramMap.put("date", new java.sql.Date(request.getDate().getTime()));
        //todo: отсев по дате
         List<Project> projects = projectMapper.getProjects(paramMap);
         return projects;
    }
}
