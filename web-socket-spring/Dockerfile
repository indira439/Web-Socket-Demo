##Pull jdk11 from DockerHub
FROM openjdk:11
##Specify the work directory
WORKDIR usr/src/web-socket
##Add the jar file to be executed
ADD ./target/web-socket-0.0.1-SNAPSHOT.jar /usr/src/web-socket/web-socket-0.0.1-SNAPSHOT.jar
##ENTRYPOINT allows you to configure a container that will run as an executable
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","web-socket-0.0.1-SNAPSHOT.jar"]
