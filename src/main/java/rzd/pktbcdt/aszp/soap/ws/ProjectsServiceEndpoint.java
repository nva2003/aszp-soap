package rzd.pktbcdt.aszp.soap.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import rzd.pktbcdt.aszp.soap.ws.model.*;

@Endpoint
public class ProjectsServiceEndpoint implements WSEndpoint{

    @Autowired
    private ProjectsService projectsService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = GET_ASZP_PROJECT_REQUEST_LOCAL_PART)
    @ResponsePayload
    public ProjectsResponse getASZPProjects(@RequestPayload ProjectsRequest request) {

        logger.debug("request = " + request.toString());

        return projectsService.getASZPProjects(request);

    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = GET_PROJECT_REQUEST_LOCAL_PART)
    @ResponsePayload
    public GetProjectsResponse getProjects(@RequestPayload GetProjectsRequest request) {

        logger.debug("request = " + request.toString());

        GetProjectsResponse response = new GetProjectsResponse();
        response.setProjects(projectsService.getProjects(request));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = GET_PROJECT_INFO_REQUEST_LOCAL_PART)
    @ResponsePayload
    public ProjectInfoResponse getProjectInfo(@RequestPayload ProjectInfoRequest request) {

        logger.debug("request = " + request.toString());

        return projectsService.getProjectInfo(request);

    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = GET_PROJECT_TREE_REQUEST_LOCAL_PART)
    @ResponsePayload
    public ProjectTreeResponse getProjectTree(@RequestPayload ProjectTreeRequest request) {

        logger.debug("request = " + request.toString());

        return projectsService.getProjectTree(request);

    }
}
