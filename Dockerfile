FROM openjdk:8
ADD target/dietManagement-0.0.1-SNAPSHOT.jar dietManagement-0.0.1-SNAPSHOT.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "dietManagement-0.0.1-SNAPSHOT.jar"]
