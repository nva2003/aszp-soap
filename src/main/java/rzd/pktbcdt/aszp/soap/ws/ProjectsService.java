package rzd.pktbcdt.aszp.soap.ws;

import rzd.pktbcdt.aszp.soap.ws.model.GetProjectsRequest;
import rzd.pktbcdt.aszp.soap.ws.model.Project;
import rzd.pktbcdt.aszp.soap.ws.model.ProjectInfoResponse;

import java.util.List;

public interface ProjectsService {
    public List<Project> getProjects(GetProjectsRequest request);
    public ProjectInfoResponse getProjectsInfo(GetProjectsRequest request);
}
