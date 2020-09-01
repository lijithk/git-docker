FROM openjdk:8
EXPOSE 8080
ADD target/docker-git.jar docker-git.jar
ENTRYPOINT ["java","-jar","docker-git.jar"]