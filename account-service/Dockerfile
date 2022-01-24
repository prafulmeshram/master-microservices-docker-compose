FROM openjdk:11-slim as build

ADD https://github.com/ufoscout/docker-compose-wait/releases/download/2.9.0/wait /wait
RUN chmod +x /wait

COPY target/*jar app.jar


CMD /wait && java -jar /app.jar

#ENTRYPOINT ["java","-jar","/app.jar"]