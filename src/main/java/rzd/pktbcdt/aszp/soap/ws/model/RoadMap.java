package rzd.pktbcdt.aszp.soap.ws.model;

import rzd.pktbcdt.aszp.soap.ws.WSEndpoint;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;


/**
 * User: VNikishin
 * Date: 26.10.2020
 * Time: 15:35
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadMap",
        propOrder = {
                "idStep",
                "nameStep",
                "dateBeginStep",
                "dateEndStep",
                "statusStepId",
                "statusStepName",
                "numberStep",
                "winNext",
                "loseNext",
                "isSub",
                "reasonStep",
                "actionStep",
        } ,
        namespace = WSEndpoint.NAMESPACE_URI
)
public class RoadMap implements Serializable {


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
private static final Logger logger = LoggerFactory.getLogger( RoadMap.class );
*/

    /*--------------------------------------------
    |    I N S T A N C E   V A R I A B L E S    |
    ============================================*/
/*
    Идентификатор этапа
*/
    @XmlElement(name = "id", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private Long idStep;
    /*
        Наименование этапа
    */
    @XmlElement(name = "nameStep", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private String nameStep;
    /*
        Задает порядок этапа/подэтапа. равен 1000 - если это первый этап или подэтап
    */
    @XmlElement(name = "numberStep", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private String numberStep;
    /*
        Дата начала
    */
    @XmlElement(name = "dateBeginStep", required = false, namespace = WSEndpoint.NAMESPACE_URI)
    @XmlSchemaType(name = "dateTime")
    private Date dateBeginStep;
    /*
        Дата завершения
    */
    @XmlElement(name = "dateBeginStep", required = false, namespace = WSEndpoint.NAMESPACE_URI)
    @XmlSchemaType(name = "dateTime")
    private Date dateEndStep;
    /*
        Статус выполнения этапа
    */
    private long statusStepId;
    private String statusStepName;
    /*
        Следующий при удачном выполнении
    */
    private Long winNext;
    /*
        Следующий при невыполнении
    */
    private Long loseNext;
    /*
        Идентификатор родителя, если подэтап
    */
    private Long isSub;
    /*
        Причины невыполнения
    */
    private String reasonStep;
    /*
        Действия
    */
    private String actionStep;
    /*--------------------------------------------
    |         C O N S T R U C T O R S           |
    ============================================*/
    
    
    /*--------------------------------------------
    |               M E T H O D S               |
    ============================================*/

    @Override
    public String toString() {
        return "RoadMap{" +
                "idStep=" + idStep +
                ", nameStep='" + nameStep + '\'' +
                ", numberStep='" + numberStep + '\'' +
                ", dateBeginStep=" + dateBeginStep +
                ", dateEndStep=" + dateEndStep +
                ", statusStepId=" + statusStepId +
                ", statusStepName='" + statusStepName + '\'' +
                ", winNext=" + winNext +
                ", loseNext=" + loseNext +
                ", isSub=" + isSub +
                ", reasonStep='" + reasonStep + '\'' +
                ", actionStep='" + actionStep + '\'' +
                '}';
    }

    public Long getIdStep() {
        return idStep;
    }

    public void setIdStep(Long idStep) {
        this.idStep = idStep;
    }

    public String getNameStep() {
        return nameStep;
    }

    public void setNameStep(String nameStep) {
        this.nameStep = nameStep;
    }

    public String getNumberStep() {
        return numberStep;
    }

    public void setNumberStep(String numberStep) {
        this.numberStep = numberStep;
    }

    public Date getDateBeginStep() {
        return dateBeginStep;
    }

    public void setDateBeginStep(Date dateBeginStep) {
        this.dateBeginStep = dateBeginStep;
    }

    public Date getDateEndStep() {
        return dateEndStep;
    }

    public void setDateEndStep(Date dateEndStep) {
        this.dateEndStep = dateEndStep;
    }

    public long getStatusStepId() {
        return statusStepId;
    }

    public void setStatusStepId(long statusStepId) {
        this.statusStepId = statusStepId;
    }

    public String getStatusStepName() {
        return statusStepName;
    }

    public void setStatusStepName(String statusStepName) {
        this.statusStepName = statusStepName;
    }

    public Long getWinNext() {
        return winNext;
    }

    public void setWinNext(Long winNext) {
        this.winNext = winNext;
    }

    public Long getLoseNext() {
        return loseNext;
    }

    public void setLoseNext(Long loseNext) {
        this.loseNext = loseNext;
    }

    public Long getIsSub() {
        return isSub;
    }

    public void setIsSub(Long isSub) {
        this.isSub = isSub;
    }

    public String getReasonStep() {
        return reasonStep;
    }

    public void setReasonStep(String reasonStep) {
        this.reasonStep = reasonStep;
    }

    public String getActionStep() {
        return actionStep;
    }

    public void setActionStep(String actionStep) {
        this.actionStep = actionStep;
    }
}
