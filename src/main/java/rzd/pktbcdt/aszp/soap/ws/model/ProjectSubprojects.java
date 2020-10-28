package rzd.pktbcdt.aszp.soap.ws.model;

import java.io.Serializable;

/**
 * User: VNikishin
 * Date: 28.10.2020
 * Time: 11:45
 */
public class ProjectSubprojects implements Serializable {


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
    
    //    идентификатор проекта (родителя)
    private int parentId;
    //    идентификатор проекта (наследник)
    private int childId;
    //    уровень вложенности узла дерева
    private int level;
    /*--------------------------------------------
    |               M E T H O D S               |
    ============================================*/

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
        return "ProjectSubprojects{" +
                "parentId=" + parentId +
                ", childId=" + childId +
                ", level=" + level +
                '}';
    }
}
