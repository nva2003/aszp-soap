package rzd.pktbcdt.aszp.soap.ws;

import rzd.pktbcdt.aszp.soap.ws.model.Project;

import java.util.List;

public interface ProjectsService {
    public List<Project> getProjectsWithKeyIndicators(Integer typeIndicator);
    public void getKeyIndicators(int projectId);
    public void getProjects(int projectId);
}
