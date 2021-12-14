package rzd.pktbcdt.aszp.soap.ws.model;

import rzd.pktbcdt.aszp.soap.ws.WSEndpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndicatorSummary",
        propOrder = {
                "idIndicator",
                "idProject",
                "IndicatorSummaryValues",
        },
        namespace = WSEndpoint.NAMESPACE_URI
)
public class IndicatorSummary {

    @XmlElement(name = "idIndicator", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int idIndicator;
    @XmlElement(name = "idProject", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int idProject;

    @XmlElement(name = "IndicatorSummaryValues", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private List<IndicatorSummaryValue> IndicatorSummaryValues;

    public int getIdIndicator() {
        return idIndicator;
    }

    public void setIdIndicator(int idIndicator) {
        this.idIndicator = idIndicator;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public List<IndicatorSummaryValue> getIndicatorSummaryValues() {
        return IndicatorSummaryValues;
    }

    public void setIndicatorSummaryValues(List<IndicatorSummaryValue> indicatorSummaryValues) {
        IndicatorSummaryValues = indicatorSummaryValues;
    }
}
