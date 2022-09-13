FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-emp-docker.jar spring-boot-emp-docker.jar
ENTRYPOINT ["java","-jar","/spring-boot-emp-docker.jar"]