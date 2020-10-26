//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.04 at 09:39:10 PM IST 
//


package rzd.pktbcdt.aszp.soap.ws.model;

import rzd.pktbcdt.aszp.soap.ws.WSEndpoint;

import javax.xml.bind.annotation.*;
import java.util.Date;


/**

 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProjectsRequest", propOrder = {
    "idProject"
    ,"year"
    ,"date"
    },
        namespace = WSEndpoint.NAMESPACE_URI
)
@XmlRootElement(name = WSEndpoint.GET_PROJECT_REQUEST_LOCAL_PART, namespace = WSEndpoint.NAMESPACE_URI)
public class GetProjectsRequest {

    @XmlElement(
            required = false, nillable = false
            , namespace = WSEndpoint.NAMESPACE_URI
    )

//    @Documentation

    private Integer year;
    private Long idProject;
    @XmlElement(name = "dateEndProject", required = false, namespace = WSEndpoint.NAMESPACE_URI)
    @XmlSchemaType(name = "dateTime")
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getIdProject() {
        return idProject;
    }

    public void setIdProject(Long idProject) {
        this.idProject = idProject;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link int }
     *     
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Sets the value of the Year property.
     * 
     * @param value
     *     allowed object is
     *     {@link int }
     *     
     */
    public void setYear(Integer value) {
        this.year = value;
    }

    @Override
    public String toString() {
        return "GetProjectsRequest{" +
                "year=" + year +
                ", idProject='" + idProject + '\'' +
                '}';
    }
}
