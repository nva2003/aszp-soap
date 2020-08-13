package rzd.pktbcdt.aszp.soap.ws.model;

import rzd.pktbcdt.aszp.soap.ws.WSEndpoint;

import javax.xml.bind.annotation.*;
import java.util.Date;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Project",
        propOrder = {
        "idProject",
        "nameProject",
        "nameProjectFull",
        "descriptionProject",
        "dateBeginProject",
        "dateEndProject",
        "typeProject",
        "indicators",
        } ,
        namespace = WSEndpoint.NAMESPACE_URI
)
public class Project {

    @XmlElement(name = "idProject", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int idProject;
    @XmlElement(name = "nameProject", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private String nameProject;
    @XmlElement(name = "nameProjectFull", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private String nameProjectFull;
    @XmlElement(name = "descriptionProject", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private String descriptionProject;
    @XmlElement(name = "dateBeginProject", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    @XmlSchemaType(name = "dateTime")
    private Date dateBeginProject;
    @XmlElement(name = "dateEndProject", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    @XmlSchemaType(name = "dateTime")
    private Date dateEndProject;

    @XmlElement(name = "typeProject", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private String typeProject;

    @XmlElement(name = "indicators", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private List<Indicator> indicators;

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public String getNameProjectFull() {
        return nameProjectFull;
    }

    public void setNameProjectFull(String nameProjectFull) {
        this.nameProjectFull = nameProjectFull;
    }

    public String getDescriptionProject() {
        return descriptionProject;
    }

    public void setDescriptionProject(String descriptionProject) {
        this.descriptionProject = descriptionProject;
    }

    public Date getDateBeginProject() {
        return dateBeginProject;
    }

    public void setDateBeginProject(Date dateBeginProject) {
        this.dateBeginProject = dateBeginProject;
    }

    public Date getDateEndProject() {
        return dateEndProject;
    }

    public void setDateEndProject(Date dateEndProject) {
        this.dateEndProject = dateEndProject;
    }

    public String getTypeProject() {
        return typeProject;
    }

    public void setTypeProject(String typeProject) {
        this.typeProject = typeProject;
    }
}
