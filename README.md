#  E-Commerce Microservices with Spring Cloud & Gradle

> A complete microservices demo system for e-commerce, built with Spring Boot 3 and Spring Cloud, containerized using Docker Compose.


This is a microservices-based e-commerce example built with **Spring Boot 3** and **Spring Cloud**, demonstrating a complete order flow — including **Customer**, **Product**, **Order**, **Payment**, and **Notification** — along with common microservice patterns and integrations.

This project is adapted from the following tutorial, with the original **Maven build system migrated to Gradle**:

-  Video tutorial: [Microservices Architecture with Spring Boot 3 and Spring Cloud](https://youtu.be/jdeSV0GRvwI?si=1wEYDEJmJ5YkqzC5)  
-  Source reference: [ali-bouali/microservices-full-code](https://github.com/ali-bouali/microservices-full-code)



---

## Architecture Diagram
 *The diagram used below is provided by the original author and reused in this project.*

![Architecture Diagram](image.png)

---

## Technologies & Tools

| Category        | Technology                                   |
|----------------|----------------------------------------------|
| Framework      | Spring Boot 3, Spring Cloud                  |
| Config Server  | Spring Cloud Config                          |
| Service Registry | Eureka Server                              |
| Routing        | API Gateway                                  |
| Messaging      | Apache Kafka                                 |
| Databases      | PostgreSQL, MongoDB                          |
| Mail Service   | MailDev *(mock email server)*                |
| Tracing        | Zipkin *(Distributed Tracing)*               |
| Admin Tools    | PgAdmin, Mongo Express                       |
| Containerization | Docker Compose                             |

---



