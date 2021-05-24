package rzd.pktbcdt.aszp.soap.ws.mapper;

import org.apache.ibatis.annotations.Mapper;
import rzd.pktbcdt.aszp.soap.ws.model.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProjectMapper {
    List<Project> getProjects(Map map);
    List<ProjectTree> getProjectSub(Map map);
    List<ProjectTree> getProjectSubprojects(Map map);
    Project getProjectInfo(Map map);
    @Deprecated
    //пернесено в другой этап
    List<Risk> getProjectRisks(Map map);
    List<Indicator> getProjectIndicators(Map map);
    List<Indicator> getIndicators(Map map);
    @Deprecated
    //пернесено в другой этап
    List<RoadMap> getProjectRoadMap(Map map);
}
