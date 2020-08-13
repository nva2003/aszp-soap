package rzd.pktbcdt.aszp.soap.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rzd.pktbcdt.aszp.soap.ws.mapper.ProjectMapper;
import rzd.pktbcdt.aszp.soap.ws.model.Project;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProjectsServiceImpl implements ProjectsService {

    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public List<Project> getProjectsWithKeyIndicators(Integer typeIndicator) {
        Map<String, Serializable> map = new HashMap<String, Serializable>();
        map.put("typeIndicator", typeIndicator);

        List<Project> projectsWithKeyIndicators = projectMapper.getProjectsWithKeyIndicators(map);

        return projectsWithKeyIndicators;
    }

    @Override
    public void getKeyIndicators(int projectId) {
//todo
    }

    @Override
    public void getProjects(int projectId) {
//todo
    }
}
