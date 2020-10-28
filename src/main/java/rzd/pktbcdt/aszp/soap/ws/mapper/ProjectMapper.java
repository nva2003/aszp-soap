package rzd.pktbcdt.aszp.soap.ws.mapper;

import org.apache.ibatis.annotations.Mapper;
import rzd.pktbcdt.aszp.soap.ws.model.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProjectMapper {
    List<Project> getProjects(Map map);
    ProjectSubprojects getSubprojects(Map map);
    ProjectSubprojects getProjectSubprojects(Map map);
    Project getProjectsInfo(Map map);
    List<Risk> getProjectRisks(Map map);
    List<Indicator> getProjectIndicators(Map map);
    List<RoadMap> getProjectRoadMap(Map map);
}
