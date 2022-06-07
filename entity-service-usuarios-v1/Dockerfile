FROM openjdk:8u151-jre-slim

EXPOSE 8083

COPY ./target/entity-service-usuarios-v1.jar /usr/src/entity-service-usuarios-v1.jar

WORKDIR /usr/src

CMD ["java", "-jar" , "entity-service-usuarios-v1.jar"]