//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.04 at 09:39:10 PM IST 
//


package rzd.pktbcdt.aszp.soap.ws.model;

import rzd.pktbcdt.aszp.soap.ws.WSEndpoint;

import javax.xml.bind.annotation.*;


/**

 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = WSEndpoint.GET_PROJECT_TREE_REQUEST_LOCAL_PART, propOrder = {
//@XmlType(name = "ProjectsInfoRequest", propOrder = {
    "idProject"
    },
        namespace = WSEndpoint.NAMESPACE_URI
)
@XmlRootElement(name = WSEndpoint.GET_PROJECT_TREE_REQUEST_LOCAL_PART, namespace = WSEndpoint.NAMESPACE_URI)
public class ProjectTreeRequest {




    @XmlElement(name = "idProject", required = true, nillable = false, namespace = WSEndpoint.NAMESPACE_URI)
    private Long idProject;



    public Long getIdProject() {
        return idProject;
    }

    public void setIdProject(Long idProject) {
        this.idProject = idProject;
    }


    @Override
    public String toString() {
        return "ProjectsTreeRequest{" +
                "idProject=" + idProject +
                '}';
    }
}