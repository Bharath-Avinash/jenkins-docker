FROM maslick/minimalka:jdk11
VOLUME /tmp
ADD target/Jpa_Project-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]