FROM openjdk:8u151-jre-slim

EXPOSE 8085

COPY ./target/task-service-contratos-v1.jar /usr/src/task-service-contratos-v1.jar

WORKDIR /usr/src

CMD ["java", "-jar" , "task-service-contratos-v1.jar"]