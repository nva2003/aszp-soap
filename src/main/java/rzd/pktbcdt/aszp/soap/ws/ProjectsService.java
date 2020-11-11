package rzd.pktbcdt.aszp.soap.ws;

import rzd.pktbcdt.aszp.soap.ws.model.*;

import java.util.List;

public interface ProjectsService {
    public List<Project> getProjects(GetProjectsRequest request);
    public ProjectInfoResponse getProjectsInfo(ProjectsInfoRequest request);
    public ProjectTreeResponse getProjectTree(ProjectTreeRequest request);
}
