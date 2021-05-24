package rzd.pktbcdt.aszp.soap.ws;

import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import rzd.pktbcdt.aszp.soap.ws.model.GetProjectsRequest;
import rzd.pktbcdt.aszp.soap.ws.model.GetProjectsResponse;

public interface WSEndpoint {
    String NAMESPACE_URI = "http://aszp.pktbcdt.rzd/ProjectsService";

    String GET_PROJECT_TREE_REQUEST_LOCAL_PART = "getProjectTreeRequest";
    String GET_PROJECT_TREE_RESPONSE_LOCAL_PART = "getProjectTreeResponse";

    String GET_PROJECT_INFO_REQUEST_LOCAL_PART = "getProjectInfoRequest";
    String GET_PROJECT_INFO_RESPONSE_LOCAL_PART = "getProjectInfoResponse";
    String GET_PROJECT_REQUEST_LOCAL_PART = "getProjectsRequest";
    String GET_PROJECT_RESPONSE_LOCAL_PART = "getProjectsResponse";
    String GET_ASZP_PROJECT_REQUEST_LOCAL_PART = "getASZPProjectsRequest";
    String GET_ASZP_PROJECT_RESPONSE_LOCAL_PART = "getASZPProjectsResponse";
    String WS_URI = "/aszp-soap/ws";
    String WSDL = "projects";
}
