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
@XmlType(name = "", propOrder = {
    "typeIndicator"
    },
        namespace = WSEndpoint.NAMESPACE_URI
)
@XmlRootElement(name = "getProjectsRequest", namespace = WSEndpoint.NAMESPACE_URI)
public class GetProjectsRequest {

    @XmlElement(
            required = false, nillable = false
            , namespace = WSEndpoint.NAMESPACE_URI
    )

//    @Documentation
    protected Integer typeIndicator;

    /**
     * Gets the value of the typeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link int }
     *     
     */
    public Integer getTypeIndicator() {
        return typeIndicator;
    }

    /**
     * Sets the value of the typeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link int }
     *     
     */
    public void setTypeIndicator(Integer value) {
        this.typeIndicator = value;
    }

    @Override
    public String toString() {
        return "GetProjectsRequest{" +
                "typeIndicator=" + typeIndicator +
                '}';
    }
}
