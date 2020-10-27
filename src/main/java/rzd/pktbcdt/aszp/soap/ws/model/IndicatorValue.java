package rzd.pktbcdt.aszp.soap.ws.model;

import rzd.pktbcdt.aszp.soap.ws.WSEndpoint;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndicatorValue",
        propOrder = {
        "idIndicatorValue",
        "year",
        "periodType",
        "periodValue",
        "planValue",
        "realValue",
        "prognosis",
        },
        namespace = WSEndpoint.NAMESPACE_URI
)
public class IndicatorValue {

    @XmlElement(name = "idIndicatorValue", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int idIndicatorValue;
    //    @Documentation
    @XmlElement(name = "year", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int year;
    @XmlElement(name = "periodType", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int periodType;
    @XmlElement(name = "periodValue", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int periodValue;
    @XmlElement(name = "planValue", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private Double planValue;
    @XmlElement(name = "realValue", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private Double realValue;
    @XmlElement(name = "prognosis", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int prognosis;

    public int getIdIndicatorValue() {
        return idIndicatorValue;
    }

    public void setIdIndicatorValue(int idIndicatorValue) {
        this.idIndicatorValue = idIndicatorValue;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPeriodType() {
        return periodType;
    }

    public void setPeriodType(int periodType) {
        this.periodType = periodType;
    }

    public int getPeriodValue() {
        return periodValue;
    }

    public void setPeriodValue(int periodValue) {
        this.periodValue = periodValue;
    }

    public Double getPlanValue() {
        return planValue;
    }

    public void setPlanValue(Double planValue) {
        this.planValue = planValue;
    }

    public Double getRealValue() {
        return realValue;
    }

    public void setRealValue(Double realValue) {
        this.realValue = realValue;
    }

    public int getPrognosis() {
        return prognosis;
    }

    public void setPrognosis(int prognosis) {
        this.prognosis = prognosis;
    }
}
