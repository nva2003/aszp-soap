# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.2.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.2.RELEASE/maven-plugin/reference/html/#build-image)
* [Spring Web Services](https://docs.spring.io/spring-boot/docs/2.3.2.RELEASE/reference/htmlsingle/#boot-features-webservices)
* [JDBC API](https://docs.spring.io/spring-boot/docs/2.3.2.RELEASE/reference/htmlsingle/#boot-features-sql)
* [Spring Security](https://docs.spring.io/spring-boot/docs/2.3.2.RELEASE/reference/htmlsingle/#boot-features-security)
* [MyBatis Framework](https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)

### Guides
The following guides illustrate how to use some features concretely:

* [Producing a SOAP web service](https://spring.io/guides/gs/producing-web-service/)
* [Accessing Relational Data using JDBC with Spring](https://spring.io/guides/gs/relational-data-access/)
* [Managing Transactions](https://spring.io/guides/gs/managing-transactions/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [MyBatis Quick Start](https://github.com/mybatis/spring-boot-starter/wiki/Quick-Start)

###jaxb2
 plugin to the build process. We will use it to generate XML Schema Definition (.xsd) for our web service. 
 The information for generating the schema will come from Java classes.

### Generate XSD from Java Classes with Maven
With the help of the jaxb2-maven-plugin we can generate XSD schemas from Java Classes. By default it scans all the folders in src/main/java recursively for annotated JAX-B Java Classes
* First step is to add annotations such as @XmlRootElement, @XmlAccessorType and @XmlElement etc. to your Java classes.
* "SimpleNamespaceResolver contained no localNamespaceURI" check all the java classes have:
@XmlRootElement(namespace ="http://some/namespace")
@XmlType(namespace ="http://some/namespace")


### Java Class to be Transformed into XSD Schema
1) создаем модели и помечаем аннотациями.
In order for a Java Class to be eligible for an XSD schema candidate, the class must be annotated with the @XmlType annotation. 
2) we give the class a concrete namespace "http://aszp.pktbcdt.rzd/ProjectsService"
### Generated XSD
Once the project is build, it will generate XSD classes in target/generated-resources/schemagen directory.


###Endpoint
Moving now to the core — let's implement the endpoint. 
A default approach is to annotate it with @Endpoint annotation and write an implementation of our operation.
 @PayloadRoot is used to denote the name of the primary element.
  The correct operation will be picked by this element. 
  It's also necessary to use a matching @XmlRootElement annotation on the class definition.
   but  we can use a slightly different approach (https://blog.termian.dev/posts/contract-last-spring-ws/).
  Annotate the response with @ResponsePayload and the request with @RequestPayload.

##Here is a little quirk of Spring-WS. 
The default implementation of WSDL generation works based on name suffixes. 
Request elements should end up with Request suffix,
 responses with Response suffix and, 
 as you might have guessed, faults with Fault suffix.
It's easy to change the suffixes, however, the mechanism stays the same.
 The framework creates necessary messages and the operation is combined using same base name,
 i.e. getUserRequest, getUserResponse and getUserFault will end up in a getUser operation.
 
###Generating WSDL
To finish the MVP (Minimum Viable Product) we need to generate the WSDL 
and register the web service. 
Three beans are needed for this.
Firstly, MessageDispatcherServlet is used to load the web services context (just like Spring MVC DispatcherServlet).
Next, the DefaultWsdl11Definition will generate the specification with schema provided by the third bean 
returning XsdSchema. Here you can set the aforementioned suffixes. 
Don't forget to add @EnableWs annotation to your @Configuration 
so that the Spring Boot will load necessary WS mappings provided by *WsConfigurationSupport*. 