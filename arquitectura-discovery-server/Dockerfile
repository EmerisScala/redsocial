FROM openjdk:8u151-jre-slim

EXPOSE 8761

COPY ./target/arquitectura-discovery-server.jar /usr/src/arquitectura-discovery-server.jar

WORKDIR /usr/src

CMD ["java", "-jar" , "arquitectura-discovery-server.jar"]