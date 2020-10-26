package rzd.pktbcdt.aszp.soap.ws;

public interface WSEndpoint {
    String NAMESPACE_URI = "http://aszp.pktbcdt.rzd/ProjectsService";
    String GET_PROJECT_INFO_REQUEST_LOCAL_PART = "GetProjectInfoRequest";
    String GET_PROJECT_INFO_RESPONSE_LOCAL_PART = "GetProjectInfoResponse";
    String GET_PROJECT_REQUEST_LOCAL_PART = "getProjectsRequest";
    String GET_PROJECT_RESPONSE_LOCAL_PART = "getProjectsResponse";
    String WS_URI = "/aszp-soap/ws";
    String WSDL = "projects";
}
