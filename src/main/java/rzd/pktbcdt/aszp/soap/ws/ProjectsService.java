package rzd.pktbcdt.aszp.soap.ws;

import rzd.pktbcdt.aszp.soap.ws.model.*;

import java.util.List;

public interface ProjectsService {
    @Deprecated
    public List<Project> getProjects(GetProjectsRequest request);
    @Deprecated
    public ProjectInfoResponse getProjectInfo(ProjectInfoRequest request);
    @Deprecated
    public ProjectTreeResponse getProjectTree(ProjectTreeRequest request);
    public ProjectsResponse getASZPProjects(ProjectsRequest request);
}
