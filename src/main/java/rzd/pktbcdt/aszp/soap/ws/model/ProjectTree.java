package rzd.pktbcdt.aszp.soap.ws.model;

import rzd.pktbcdt.aszp.soap.ws.WSEndpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * User: VNikishin
 * Date: 28.10.2020
 * Time: 11:45
 */


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectTree",
        propOrder = {
        "id",
        "parentId",
        "childId",
        "level",

        } ,
        namespace = WSEndpoint.NAMESPACE_URI
)
public class ProjectTree implements Serializable {


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
private static final Logger logger = LoggerFactory.getLogger( ProjectSubprojects.class );
*/
    
    /*--------------------------------------------
    |    I N S T A N C E   V A R I A B L E S    |
    ============================================*/


    /*--------------------------------------------
    |         C O N S T R U C T O R S           |
    ============================================*/
    
    //    идентификатор проекта (записи в таблицу)
    @XmlElement(name = "id", required = false, namespace = WSEndpoint.NAMESPACE_URI)
    private int id;
    //    идентификатор проекта (родителя)
    @XmlElement(name = "parentId", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int parentId;
    //    идентификатор проекта (наследник)
    @XmlElement(name = "childId", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int childId;
    //    уровень вложенности узла дерева
    @XmlElement(name = "level", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private int level;
    /*--------------------------------------------
    |               M E T H O D S               |
    ============================================*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getChildId() {
        return childId;
    }

    public void setChildId(int childId) {
        this.childId = childId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "ProjectTree{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", childId=" + childId +
                ", level=" + level +
                '}';
    }
}
