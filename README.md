# Drinks Web API
Web API with test-first approach using Spring Boot and Maven.

## Use cases

### Home API Endpoint

#### Scenario 1:
As a user<br>
when I do a GET request to the / endpoint<br>
I will see the string message as a response<br>
which says Welcome to the Drinks API!

## Test Driven Approach

1) Add test for Home API endpoint, Scenario 1. See test [here](https://htmlview.glitch.me/?https://github.com/abcpaem/drinks-web-api/blob/main/docs/TestResults01.html).

---
### How to run the web application
1) cd to the project root folder in the command line
2) `mvn spring-boot:run`
3) Open `http://localhost:8080/` in your browser.

To run tests use:
- ``mvn test``

## Technology
This project was built using:
- Spring Boot 2.6.7
- Java 17.0.2
- JUnit 5.8.2
- Maven 3.8.5
- IntelliJ 2021.3.2 (Community Edition).