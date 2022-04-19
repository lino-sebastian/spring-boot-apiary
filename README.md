# spring-boot-apiary
Spring Boot demo project utilizing [Apiary](https://apiary.io/) API documentations using Swagger.
Apiary supports Swagger as the API Description format.
Swagger is an alternative format to API Blueprint for describing our API that we can use in Apiary

## Swagger
Swagger is an Interface Description Language for describing RESTful APIs expressed using JSON. 

Swagger is used together with a set of open-source software tools to design, build, document, and use RESTful web services.

## What have been done
1. Constructed basic Spring boot project using [Spring Initializer](https://start.spring.io/)
2. Added required dependencies for Swagger
3. Added required plugin configuration for generating Swagger API and Models
4. Constructed Swagger API documentation as per this [guidelines](https://help.apiary.io/api_101/swagger-tutorial/)
5. Downloaded the created [Swagger Documentation](https://postmeridiemswaggerapi.docs.apiary.io/#)
6. Added the yaml config in classpath
7. Generated Swagger API and Models on **Build**

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
- Swagger Apiary : https://help.apiary.io/swagger/
- Spring Initializer : https://start.spring.io/
