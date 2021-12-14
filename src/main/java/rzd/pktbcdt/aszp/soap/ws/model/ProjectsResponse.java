package rzd.pktbcdt.aszp.soap.ws.model;

import rzd.pktbcdt.aszp.soap.ws.WSEndpoint;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = WSEndpoint.GET_ASZP_PROJECT_RESPONSE_LOCAL_PART,
        propOrder = {
        "projects"
        ,"projectTree"
        ,"indicators"
        ,"indicatorsSummaries"
        } ,
        namespace = WSEndpoint.NAMESPACE_URI
)
@XmlRootElement(name = WSEndpoint.GET_ASZP_PROJECT_RESPONSE_LOCAL_PART, namespace = WSEndpoint.NAMESPACE_URI)
public class ProjectsResponse {

    @XmlElementWrapper(name = "projects", nillable = true)
    @XmlElement(name = "project", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private List<Project> projects;

    @XmlElementWrapper(name = "indicators", nillable = true)
    @XmlElement(name = "indicator", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private List<Indicator> indicators;

    @XmlElementWrapper(name = "indicatorSummaries", nillable = true)
    @XmlElement(name = "indicatorSummary", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private List<IndicatorSummary> indicatorsSummaries;

    @XmlElementWrapper(name = "projectTree", nillable = true)
    @XmlElement(name = "project", required = true, namespace = WSEndpoint.NAMESPACE_URI)
    private List<ProjectTree> projectTree;




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

    public List<Indicator> getIndicators() {
        return indicators;
    }

    public void setIndicators(List<Indicator> indicators) {
        this.indicators = indicators;
    }

    public List<IndicatorSummary> getIndicatorsSummaries() {
        return indicatorsSummaries;
    }

    public void setIndicatorsSummaries(List<IndicatorSummary> indicatorsSummaries) {
        this.indicatorsSummaries = indicatorsSummaries;
    }



    @Override
    public String toString() {
        return "ProjectsResponse{" +
                "projects=" + projects +
                ", indicators=" + indicators +
                ", projectTree=" + projectTree +
                '}';
    }
}


