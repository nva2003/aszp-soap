package rzd.pktbcdt.aszp.soap.ws.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import rzd.pktbcdt.aszp.soap.ws.WSEndpoint;

@EnableWs
@Configuration
@ComponentScan(value = "rzd.pktbcdt.aszp.soap.ws")
public class WebServiceConfig extends WsConfigurerAdapter {
    // bean definitions
    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/*");
    }

    @Bean(name = "projects")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema projectsSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("Projects");
        wsdl11Definition.setLocationUri(WSEndpoint.WS_URI);
        wsdl11Definition.setTargetNamespace(WSEndpoint.NAMESPACE_URI);
        wsdl11Definition.setSchema(projectsSchema);
        wsdl11Definition.setRequestSuffix("Request");
        wsdl11Definition.setResponseSuffix("Response");
//        wsdl11Definition.setFaultSuffix("commonFault");
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema projectsSchema() {
        return new SimpleXsdSchema(new ClassPathResource("project.xsd"));
    }



}
