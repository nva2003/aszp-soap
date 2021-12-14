package rzd.pktbcdt.aszp.soap.ws.model;

import rzd.pktbcdt.aszp.soap.ws.WSEndpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndicatorSummaryValue",
        propOrder = {
        "idIndicatorSummaryValue",
        "startYear",
        "year",
        "periodType",
        "periodValue",
        "planValue",
        "realValue",
        },
        namespace = WSEndpoint.NAMESPACE_URI
)
public class IndicatorSummaryValue {

    @XmlElement(name = "idIndicatorSummaryValue", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int idIndicatorSummaryValue;
    @XmlElement(name = "year", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int year;
    @XmlElement(name = "startYear", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int startYear;
    @XmlElement(name = "periodType", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int periodType;
    @XmlElement(name = "periodValue", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int periodValue;
    @XmlElement(name = "planValue", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private Double planValue;
    @XmlElement(name = "realValue", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private Double realValue;


    public int getIdIndicatorSummaryValue() {
        return idIndicatorSummaryValue;
    }

    public void setIdIndicatorSummaryValue(int idIndicatorSummaryValue) {
        this.idIndicatorSummaryValue = idIndicatorSummaryValue;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
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


}
