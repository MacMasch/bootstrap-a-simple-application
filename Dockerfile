FROM eclipse-temurin:17-alpine
MAINTAINER martinschuler@mac.com
COPY build/libs/bootstrap-a-simple-application-0.0.1-SNAPSHOT.jar bootstrap-a-simple-application.jar
ENTRYPOINT ["java","-jar","/bootstrap-a-simple-application.jar"]