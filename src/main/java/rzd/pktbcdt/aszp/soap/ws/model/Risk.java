package rzd.pktbcdt.aszp.soap.ws.model;

import rzd.pktbcdt.aszp.soap.ws.WSEndpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * User: VNikishin
 * Date: 26.10.2020
 * Time: 13:35
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Risk",
        propOrder = {
        "id",
        "name",
        "impact",
        "probability",
        "status",
        } ,
        namespace = WSEndpoint.NAMESPACE_URI
)
@Deprecated
public class Risk implements Serializable {


    /*--------------------------------------------
    |             C O N S T A N T S             |
    ============================================*/

    private static final long serialVersionUID = 1L;
/*
     используем статический logger, чтобы избежать вопросов сериализации
     static to optimize serialization
     protect- available to subclasses
        
*/
/*
for slf4j
private static final Logger logger = LoggerFactory.getLogger( Risk.class );
*/
    
    /*--------------------------------------------
    |    I N S T A N C E   V A R I A B L E S    |
    ============================================*/
    @XmlElement(name = "id", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    Long id;
    //Наименование
    @XmlElement(name = "name", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    String name;
    //Влияние
    @XmlElement(name = "impact", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    Integer impact;

    //Вероятность
    @XmlElement(name = "probability", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    Integer probability;
    //Статус
    @XmlElement(name = "status", required = true, namespace = WSEndpoint.NAMESPACE_URI)
     Integer status;


    /*--------------------------------------------
    |         C O N S T R U C T O R S           |
    ============================================*/
    
    
    /*--------------------------------------------
    |               M E T H O D S               |
    ============================================*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImpact() {
        return impact;
    }

    public void setImpact(Integer impact) {
        this.impact = impact;
    }

    public Integer getProbability() {
        return probability;
    }

    public void setProbability(Integer probability) {
        this.probability = probability;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
