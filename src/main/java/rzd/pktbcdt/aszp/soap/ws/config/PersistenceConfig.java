package rzd.pktbcdt.aszp.soap.ws.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration

@EnableTransactionManagement
@MapperScan("rzd.pktbcdt.aszp.soap.ws.mapper")
// mybatis scan path for interface Mapper class

public class PersistenceConfig {
}
