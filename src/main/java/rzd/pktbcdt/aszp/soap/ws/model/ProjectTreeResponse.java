package rzd.pktbcdt.aszp.soap.ws.model;

import rzd.pktbcdt.aszp.soap.ws.WSEndpoint;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = WSEndpoint.GET_PROJECT_TREE_RESPONSE_LOCAL_PART,
        propOrder = {
        "projectTree"
        } ,
        namespace = WSEndpoint.NAMESPACE_URI
)
@XmlRootElement(name = WSEndpoint.GET_PROJECT_TREE_RESPONSE_LOCAL_PART, namespace = WSEndpoint.NAMESPACE_URI)
public class ProjectTreeResponse {

    @XmlElement(name = "projectTree", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private List<ProjectTree> projectTree;

    public List<ProjectTree> getProjectTree() {
        return projectTree;
    }

    public void setProjectTree(List<ProjectTree> projectTree) {
        this.projectTree = projectTree;
    }

    @Override
    public String toString() {
        return "ProjectTreeResponse{" +
                "projectTree=" + projectTree +
                '}';
    }
}


