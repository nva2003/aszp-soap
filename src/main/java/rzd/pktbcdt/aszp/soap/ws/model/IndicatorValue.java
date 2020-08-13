package rzd.pktbcdt.aszp.soap.ws.model;

import rzd.pktbcdt.aszp.soap.ws.WSEndpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndicatorValue",
        propOrder = {
        "idIndicatorValue",
        "year",
        "half",
        "quarter",
        "month",
        "planValue",
        "realValue",
        },
        namespace = WSEndpoint.NAMESPACE_URI
)
public class IndicatorValue {

    @XmlElement(name = "idIndicatorValue", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int idIndicatorValue;
    //    @Documentation
    @XmlElement(name = "year", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int year;
    @XmlElement(name = "half", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int half;
    @XmlElement(name = "quarter", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int quarter;
    @XmlElement(name = "month", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int month;
    @XmlElement(name = "planValue", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int planValue;
    @XmlElement(name = "realValue", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int realValue;

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

    public int getHalf() {
        return half;
    }

    public void setHalf(int half) {
        this.half = half;
    }

    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getPlanValue() {
        return planValue;
    }

    public void setPlanValue(int planValue) {
        this.planValue = planValue;
    }

    public int getRealValue() {
        return realValue;
    }

    public void setRealValue(int realValue) {
        this.realValue = realValue;
    }
}
