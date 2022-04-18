# spring-boot-apiary
Spring Boot demo project utilizing [Apiary](https://apiary.io/) documentations with [Feign Client](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-feign.html)

## Apiary
Oracle API Platform Cloud Service integrates with Oracle Apiary to provide API design and documentation features.

Oracle Apiary provides you with the ability to design APIs using either API Blueprint or Swagger 2.0. From these description files, Oracle Apiary generates interactive documentation and a console for making calls to the APIs from the UI.

Oracle Apiary also instantiates a mock service that you can use to interact with the examples provided in the specification file. API Managers can link APIs they have on Oracle Apiary to display interactive documentation, a test console, and mock service details on an API’s page in the Developer Portal.

## Feign Client
Feign is a declarative web service client. It makes writing web service clients easier. 

To use Feign create an interface and annotate it. It has pluggable annotation support including Feign annotations and JAX-RS annotations. Feign also supports pluggable encoders and decoders. 

Spring Cloud adds support for Spring MVC annotations and for using the same HttpMessageConverters used by default in Spring Web. Spring Cloud integrates Ribbon and Eureka to provide a load balanced http client when using Feign.

## What have been done
1. Constructed basic Spring boot app using [Spring Initializer](https://start.spring.io/)
2. Added [Feign Client dependency](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-feign)
3. Constructed sample API documentation using [Apiary](https://apiary.io/)
4. Implemented Mappings consuming from Apiary mock server using Feign Client

## Build 
```
mvn clean install
```

## Run
```
mvn spring-boot:run
```

## Tools Used
- Apiary : https://linosebastian.docs.apiary.io/
- Spring Initializer : https://start.spring.io/
