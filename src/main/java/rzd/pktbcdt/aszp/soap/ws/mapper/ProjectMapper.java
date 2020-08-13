package rzd.pktbcdt.aszp.soap.ws.mapper;

import org.apache.ibatis.annotations.Mapper;
import rzd.pktbcdt.aszp.soap.ws.model.Project;
import java.util.List;
import java.util.Map;

@Mapper
public interface ProjectMapper {
    List<Project> getProjectsWithKeyIndicators(Map map);
}
