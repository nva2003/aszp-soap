package rzd.pktbcdt.aszp.soap.ws.model;

import rzd.pktbcdt.aszp.soap.ws.WSEndpoint;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = WSEndpoint.GET_ASZP_PROJECT_RESPONSE_LOCAL_PART,
        propOrder = {
        "projects"
        ,"risks"
        ,"projectTree"
        ,"indicators"
        ,"roadMapList"
        } ,
        namespace = WSEndpoint.NAMESPACE_URI
)
@XmlRootElement(name = WSEndpoint.GET_ASZP_PROJECT_RESPONSE_LOCAL_PART, namespace = WSEndpoint.NAMESPACE_URI)
public class ProjectsResponse {

    @XmlElement(name = "projects", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private List<Project> projects;

    @XmlElement(name = "indicators", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private List<Indicator> indicators;

    @XmlElement(name = "projectTree", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private List<ProjectTree> projectTree;

    @Deprecated
    //пернесено в другой этап
    @XmlElement(name = "risks", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private List<Risk> risks;

    @Deprecated
    //пернесено в другой этап
    @XmlElement(name = "roadMapList", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private List<RoadMap> roadMapList;


    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<ProjectTree> getProjectTree() {
        return projectTree;
    }

    public void setProjectTree(List<ProjectTree> projectTree) {
        this.projectTree = projectTree;
    }

    public List<Risk> getRisks() {
        return risks;
    }

    public void setRisks(List<Risk> risks) {
        this.risks = risks;
    }

    public List<Indicator> getIndicators() {
        return indicators;
    }

    public void setIndicators(List<Indicator> indicators) {
        this.indicators = indicators;
    }

    public List<RoadMap> getRoadMapList() {
        return roadMapList;
    }

    public void setRoadMapList(List<RoadMap> roadMapList) {
        this.roadMapList = roadMapList;
    }

    @Override
    public String toString() {
        return "ProjectsResponse{" +
                "projects=" + projects +
                ", indicators=" + indicators +
                ", projectTree=" + projectTree +
                ", risks=" + risks +
                ", roadMapList=" + roadMapList +
                '}';
    }
}


