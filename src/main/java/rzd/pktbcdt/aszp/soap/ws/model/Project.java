package rzd.pktbcdt.aszp.soap.ws.model;

import rzd.pktbcdt.aszp.soap.ws.WSEndpoint;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
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
        "dateStart",
        "typeProject",
        "typeProjectName",
        "cost",
        "costCurrency",
        "manager",
        "ceo",
        "worker",
        "idCountry",
        "country"
        } ,
        namespace = WSEndpoint.NAMESPACE_URI
)


public class Project {

    @XmlElement(name = "idProject", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int idProject;
//    private BigInteger idProject;
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

    @XmlElement(name = "dateStart", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    @XmlSchemaType(name = "dateTime")
    private Date dateStart;
    @XmlElement(name = "typeProjectName", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private String typeProjectName;
    @XmlElement(name = "cost", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private BigInteger cost;
    @XmlElement(name = "costCurrency", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private String costCurrency;
    @XmlElement(name = "manager", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private String manager;
    @XmlElement(name = "ceo", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private String ceo;
    @XmlElement(name = "worker", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private String worker;
    @XmlElement(name = "country", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private String country;
    @XmlElement(name = "idCountry", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private long idCountry;

    public String getCountry() {
        return country;
    }

    public long getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(long idCountry) {
        this.idCountry = idCountry;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getCostCurrency() {
        return costCurrency;
    }

    public void setCostCurrency(String costCurrency) {
        this.costCurrency = costCurrency;
    }

    public BigInteger getCost() {
        return cost;
    }

    public void setCost(BigInteger cost) {
        this.cost = cost;
    }

    public String getTypeProjectName() {
        return typeProjectName;
    }

    public void setTypeProjectName(String typeProjectName) {
        this.typeProjectName = typeProjectName;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

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
