FROM openjdk:8
ADD target/docker-diet-management.jar docker-diet-management.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "docker-diet-management.jar"]
