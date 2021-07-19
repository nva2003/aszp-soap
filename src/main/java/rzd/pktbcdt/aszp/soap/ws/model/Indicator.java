package rzd.pktbcdt.aszp.soap.ws.model;

import rzd.pktbcdt.aszp.soap.ws.WSEndpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Indicator", propOrder = {
        "idIndicator",
        "typeIndicator",
        "nameIndicator",
        "idProject",
        "indicatorValues",
        },
        namespace = WSEndpoint.NAMESPACE_URI
)
public class Indicator {

    //    private int idProject;
    @XmlElement(name = "idIndicator", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int idIndicator;
    @XmlElement(name = "typeIndicator", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int typeIndicator;
    @XmlElement(name = "nameIndicator", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private String nameIndicator;
    @XmlElement(name = "idProject", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int idProject;

    @XmlElement(name = "indicatorValues", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private List <IndicatorValue> indicatorValues;

    public int getIdIndicator() {
        return idIndicator;
    }

    public void setIdIndicator(int idIndicator) {
        this.idIndicator = idIndicator;
    }

    public int getTypeIndicator() {
        return typeIndicator;
    }

    public void setTypeIndicator(int typeIndicator) {
        this.typeIndicator = typeIndicator;
    }

    public String getNameIndicator() {
        return nameIndicator;
    }

    public void setNameIndicator(String nameIndicator) {
        this.nameIndicator = nameIndicator;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public List<IndicatorValue> getIndicatorValues() {
        return indicatorValues;
    }

    public void setIndicatorValues(List<IndicatorValue> indicatorValues) {
        this.indicatorValues = indicatorValues;
    }
}
