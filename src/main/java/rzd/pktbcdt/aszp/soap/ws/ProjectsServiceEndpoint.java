package rzd.pktbcdt.aszp.soap.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import rzd.pktbcdt.aszp.soap.ws.model.GetProjectsRequest;
import rzd.pktbcdt.aszp.soap.ws.model.GetProjectsResponse;
import rzd.pktbcdt.aszp.soap.ws.model.ProjectInfoResponse;
import rzd.pktbcdt.aszp.soap.ws.model.ProjectsInfoRequest;

@Endpoint
public class ProjectsServiceEndpoint implements WSEndpoint{

    @Autowired
    private ProjectsService projectsService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

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
    public ProjectInfoResponse getProjectsInfo(@RequestPayload ProjectsInfoRequest request) {

        logger.debug("request = " + request.toString());

        return projectsService.getProjectsInfo(request);

    }
}
