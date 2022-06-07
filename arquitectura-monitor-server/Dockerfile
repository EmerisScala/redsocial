FROM openjdk:8u151-jre-slim

EXPOSE 8090

COPY ./target/arquitectura-monitor-server.jar /usr/src/arquitectura-monitor-server.jar

WORKDIR /usr/src

CMD ["java", "-jar" , "arquitectura-monitor-server.jar"]