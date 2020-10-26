package rzd.pktbcdt.aszp.soap.ws.model;

import rzd.pktbcdt.aszp.soap.ws.WSEndpoint;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectInfoResponse",
//@XmlType(name = WSEndpoint.GET_PROJECT_INFO_RESPONSE_LOCAL_PART,
        propOrder = {
        "project"
        ,"risks"
        ,"indicators"
        } ,
        namespace = WSEndpoint.NAMESPACE_URI
)
//@XmlRootElement(name = WSEndpoint.GET_PROJECT_INFO_RESPONSE_LOCAL_PART, namespace = WSEndpoint.NAMESPACE_URI)
public class ProjectInfoResponse {

    @XmlElement(name = "project", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    //    @XmlSchemaType(name = "Projects", namespace = WSEndpoint.NAMESPACE_URI)
    private Project project;

    @XmlElement(name = "risks", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private List<Risk> risks;

    @XmlElement(name = "indicators", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private List<Indicator> indicators;





    /**
     * Gets the value of the project property.
     *
     * @return
     *     possible object is
     *     {@link Project }
     *
     */
    public Project getProject() {
        return project;
    }



    /**
     * Sets the value of the project property.
     *
     * @param project
     *     allowed object is
     *     {@link Project }
     *
     */
    public void setProject(Project project) {
        this.project = project;
    }

    public List<Risk> getRisks() {
        return risks;
    }

    public void setRisks(List<Risk> risks) {
        this.risks = risks;
    }

    public List<Indicator> getIndicators() {
        return indicators;
    }

    public void setIndicators(List<Indicator> indicators) {
        this.indicators = indicators;
    }
}
