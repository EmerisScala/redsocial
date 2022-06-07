FROM openjdk:8u151-jre-slim

EXPOSE 8084

COPY ./target/entity-service-empresas-v1.jar /usr/src/entity-service-empresas-v1.jar

WORKDIR /usr/src

CMD ["java", "-jar" , "entity-service-empresas-v1.jar"]