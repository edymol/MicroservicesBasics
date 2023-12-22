# Microservices Project README

This microservices project consists of two main components: **Limits Service** and **Spring Cloud Config Server**. Below are details for each component:

## Limits Service

### Overview

The Limits Service is a microservice that provides information about configured limits. It exposes an endpoint `/limits` that returns a JSON object containing minimum and maximum values.

### Configuration

- **Application Properties:**
  - `spring.application.name=limits-service`
  - `spring.config.import = optional:configserver:http://localhost:8888`
  - `spring.profiles.active=dev`
  - `spring.cloud.config.profile=qa`
  - `limits-service.minimum = 3`
  - `limits-service.maximum = 997`

- **POM File:** [limits-service/pom.xml](limits-service/pom.xml)

- **Bean Class:** [xyz.deved.microservices.limitsservice.bean.Limits](limits-service/src/main/java/xyz/deved/microservices/limitsservice/bean/Limits.java)

- **Controller Class:** [xyz.deved.microservices.limitsservice.controller.LimitsController](limits-service/src/main/java/xyz/deved/microservices/limitsservice/controller/LimitsController.java)

- **Main Application Class:** [xyz.deved.microservices.limitsservice.LimitsServiceApplication](limits-service/src/main/java/xyz/deved/microservices/limitsservice/LimitsServiceApplication.java)

## Spring Cloud Config Server

### Overview

The Spring Cloud Config Server is responsible for providing centralized configuration for microservices. It is configured to retrieve configuration details from a Git repository.

### Configuration

- **Application Properties:**
  - `spring.application.name=spring-cloud-config-server`
  - `server.port=8888`
  - `spring.cloud.config.server.git.uri=file:///C:/Users/Edy/Desktop/git-localconfig-repo`

- **POM File:** [spring-cloud-config/pom.xml](spring-cloud-config/pom.xml)

- **Main Application Class:** [xyz.deved.microservices.springcloudconfig.SpringCloudConfigApplication](spring-cloud-config/src/main/java/xyz/deved/microservices/springcloudconfig/SpringCloudConfigApplication.java)

## How to Run

1. **Create a Folder and Initialize Git:**
    ```bash
    mkdir microservices-project
    cd microservices-project
    git init
    ```

2. **Create Limits Service Properties Files:**
    - Create `limits-service-qa.properties` and `limits-service-dev.properties` in the newly created folder.

3. **Commit to Local Repository:**
    ```bash
    git add .
    git commit -m "Initial commit with microservices project files"
    ```

4. **Run Spring Cloud Config Server:**
    - Navigate to the `spring-cloud-config` directory and run the Spring Cloud Config Server.

5. **Run Limits Service:**
    - Navigate to the `limits-service` directory and run the Limits Service.

---

Feel free to modify this README based on your project's specific details.
