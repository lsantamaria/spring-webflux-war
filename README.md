# WebFlux application WAR

A sample Spring Webflux project ready for being deployed as a WAR file in an external non-blocking server.
It uses Spring Webflux, Spring Data JPA and an embedded H2 database. 


### Requirements

- Java JDK 8
- Gradle 5.4 (provided)
- Application server compatible with servlet 3.1 spec

### Installation

- Download and install Java JDK 8 from the [Java official webpage](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html). 
- Set JAVA_HOME environment variable to point to the previous installation.

### Compilation

```
./gradlew compileJava
```

### Package and run 

You can also package the application as a WAR file and deploy it to your custom application server:

```
./gradlew war
```
The resulting artifact will be generated in the /build/libs folder. Deploy it in an external application server compatible with Servlet 3.1 spec.
