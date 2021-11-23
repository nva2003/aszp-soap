package rzd.pktbcdt.aszp.soap.ws;

import rzd.pktbcdt.aszp.soap.ws.model.*;

import java.util.List;

public interface ProjectsService {

    @Deprecated
    public ProjectsResponse getASZPProjects(ProjectsRequest request);

    public ProjectsResponse getASZPProjects();
}
