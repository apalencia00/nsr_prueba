
FROM adoptopenjdk/openjdk11:alpine-jre

VOLUME  /tmp

ARG JAR_FILE=target/vehiculo-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE}  app.jar

#COPY ./target/vehiculo-0.0.1-SNAPSHOT.jar  /home/app/vehiculo-0.0.1-server.jar


ENTRYPOINT ["java","-jar", "/app.jar"]

EXPOSE 8035