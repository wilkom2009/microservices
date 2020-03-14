# Microservices cloud
> Build Microservices cloud components from scratch using Spring boot Cloud.

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [Microservices](#microservices)
* [Status](#status)
* [Inspiration](#inspiration)
* [Contact](#contact)

## General info
This project helps improve many features of microservices using Spring Cloud. We implement through it communication beetween Components, client side load balancing, dynamic scaling, distributed tracing and microservices fault tolerance.
The use case of this project is Currency conversion.

## Technologies
* Spring boot - version : 2.1.3.RELEASE
* Spring boot Actuator
* Spring data Jpa
* Spring Cloud - version : Greenwich.RELEASE
* Spring Cloud Config
* Spring Cloud Bus
* Spring Cloud OpenFeign
* Spring Cloud Netflix (Zuul, Eureka, Hystrix, Ribbon)
* Spring Cloud AMQP
* Spring Cloud Sleuth
* Zipkin

## Microservices
### spring-cloud-config-server
> Server application where Spring Cloud Config Server is configured, it contains the local git repository including all the client microservices microservice-name.properties

Main class `SpringCloudConfigServerApplication.java`

### limits-service
> Microservice created to test centralized configuration, multiple environment config, Profiles config and connection to the `spring-cloud-config-server` microservice. In this project we also implement Fault Tolerance using Hystrix

### netflix-eureka-naming-service
### currency-exchange-service
### currency-conversion-service
### netflix-zuul-api-gateway-service


Spring Cloud Config Server
Establishing Communication between Microservices
Centralized Microservice Configuration with Spring Cloud Config Server
Using Spring Cloud Bus to exchange messages about Configuration updates
Simplify communication with other Microservices using Feign REST Client
Implement client side load balancing with Ribbon
Implement dynamic scaling using Eureka Naming Server and Ribbon
Implement API Gateway with Zuul
Implement Distributed tracing with Spring Cloud Sleuth and Zipkin
Implement Fault Tolerance with Zipkin


## Inspiration
This project is a hands-on for the Udemy course : [Master Microservices with Spring Boot and Spring Cloud](https://www.udemy.com/course/microservices-with-spring-boot-and-spring-cloud)
Many thanks to [Ranga Rao Karanam](https://www.linkedin.com/in/rangakaranam/) for this awesome course!

## Contact
Created by [@Wilson Koffi KOMLAN](https://www.linkedin.com/in/wilkom2009/) - feel free to contact me!
