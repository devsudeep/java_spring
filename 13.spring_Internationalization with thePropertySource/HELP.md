# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)


# ELASTICSEARCH Integration for logs

PUT _ingest/pipeline/logback
{
  "description": "logback pipeline",
  "processors": [
    {
      "set" : {
        "field": "source",
        "value": "logback"
      }
    }
  ]
}

I just tried my suggestion and it worked out perfectly.

First, add this dependency in your POM:

    <dependency>
        <groupId>org.logback-extensions</groupId>
        <artifactId>logback-ext-loggly</artifactId>
        <version>0.1.2</version>
    </dependency>
Then, in your logback.xml configuration, add an appender and a logger like this:

<appender name="ES" class="ch.qos.logback.ext.loggly.LogglyAppender">
    <endpointUrl>http://localhost:9200/tests/test?pipeline=logback</endpointUrl>
    <pattern>%m</pattern>
</appender>
<logger name="es" level="INFO" additivity="false">
    <appender-ref ref="ES"/>
</logger>

in boot spplicaiton


private Logger esLogger = LoggerFactory.getLogger("es");
...
esLogger.info("{\"message\": \"Hello World from Logback!\"}");

