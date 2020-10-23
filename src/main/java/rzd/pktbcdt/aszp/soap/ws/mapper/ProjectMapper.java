package rzd.pktbcdt.aszp.soap.ws.mapper;

import org.apache.ibatis.annotations.Mapper;
import rzd.pktbcdt.aszp.soap.ws.model.Project;
import java.util.List;
import java.util.Map;

@Mapper
public interface ProjectMapper {
    List<Project> getProjects(Map map);
    List<Project> getProjectRisks(Map map);
    List<Project> getProjectIndicators(Map map);
    List<Project> getProjectRoadMap(Map map);
}
