# Module 1 - Intro to APIs + Spring Basics

In this module you'll get introduced to API Development as well as the basics of Spring Boot.

API development is very similar to the web development you did with Django, but your web server will respond with JSON instead of HTML and CSS.

Similarly, Spring will feel a lot like Django without the HTML and CSS. You will use it code the routing, request/response processing, and database interactions.

## Topics

- API Development
- Spring Basics

## Learning Materials

- [What is a REST API? by Programming with Mosh](https://www.youtube.com/watch?v=SLwpqD8n3d0)
- :star: [Spring Boot Tutorial by Amigoscode](https://www.youtube.com/watch?v=9SGDpanrc8U). I consider this the primary learning resource for this module. It maps pretty closely to the requirements for this mastery check.
- [Baeldung Rest Tutorials](https://www.baeldung.com/rest-with-spring-series)
- [Spring MVC Documentation](https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html)
- [Spring Data JPA Documentation](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#preface)

## Mastery Check: Project

For this module, you should create an API using Spring boot that allows clients to perform CRUD operations about a single resource.

- [ ] Data is stored in a Postgresql database
- [ ] Data access is implemented with a Spring Data JPA Repository
- [ ] Request/Response is handled with a Spring Web MVC RestController
- [ ] Required endpoints
  - [ ] `GET` the collection of all entries
  - [ ] `POST` a new entry
  - [ ] `GET` a single entry
  - [ ] `PUT` a single entry
  - [ ] `DELETE` a single entry
