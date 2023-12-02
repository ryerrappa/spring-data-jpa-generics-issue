# Issue with Spring Data JPA repositories when using Generics


## Versions tried where issue doesn't occur
- Spring Boot 3.0, 3.1
- Hibernate default
- Java 17
- H2, Postgres

> Check branch `working` to see a working application.
Please note the application will still automatically shutdown, however it will successfully start up. 


## Versions Tried Where Issue Occurs
- Spring Boot 3.2
- Hibernate 6.3, 6.4
- Java 17, 21
- H2, Postgres


### Error Message

`Failed to create query for method public abstract long com.example.jparepodemo.dao.RelatedToUserJpaRepository.deleteByIdAndUser_Username(java.lang.Object,java.lang.String); Cannot compare left expression of type 'java.lang.Long' with right expression of type 'java.lang.Object'`