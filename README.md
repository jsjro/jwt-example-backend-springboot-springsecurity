# Jwt Example Backend Springboot Spring Security

## Introduction

JSON Web Token REST api server

### Available resources

The following resources are available:

#### Auth

+ ``POST /api/auth/signin`` (``JSON``) : authenticateUser
+ ``POST /api/auth/signup`` (``JSON``) : registerUser

#### Test

+ ``GET /api/test/all`` (``JSON``) : allAccess
+ ``GET /api/test/admin`` (``JSON``) : adminAcess
+ ``GET /api/test/mod`` (``JSON``) : modAccess
+ ``GET /api/test/user`` (``JSON``) : userAccess


### Back-end

The back-end is using an [PostgreSQL database](https://www.postgresql.org) behind to store the user and role.

## How to build and execute it

### Requirements

+ git
+ Java 11
+ Maven 3

### Dependency

+ springboot-web
+ springboot-data-jpa
+ springboot-security
+ jjwt
+ swagger2
+ postgresql

### Run Spring Boot application

```
mvn spring-boot:run
```

### Connected Swagger UI

+ ``http://localhost:8080/swagger-ui.html``