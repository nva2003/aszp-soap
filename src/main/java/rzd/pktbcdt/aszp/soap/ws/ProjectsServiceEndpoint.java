package rzd.pktbcdt.aszp.soap.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import rzd.pktbcdt.aszp.soap.ws.model.GetProjectsRequest;
import rzd.pktbcdt.aszp.soap.ws.model.GetProjectsResponse;

@Endpoint
public class ProjectsServiceEndpoint implements WSEndpoint{

    @Autowired
    private ProjectsService projectsService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getProjectsRequest")
    @ResponsePayload
    public GetProjectsResponse getProjects(@RequestPayload GetProjectsRequest request) {

        logger.debug("request = " + request.toString());

        GetProjectsResponse response = new GetProjectsResponse();
        //todo: typeIndicator analyse
        response.setProjects(projectsService.getProjectsWithKeyIndicators(request.getTypeIndicator()));

        return response;
    }
}
