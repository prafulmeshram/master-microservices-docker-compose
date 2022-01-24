FROM openjdk:11-slim as build

MAINTAINER meshrampraful3

COPY target/*jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]