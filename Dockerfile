FROM openjdk:17
MAINTAINER martinschuler@mac.com
COPY backend/build/libs/backend-0.0.1-SNAPSHOT.jar bootstrap-a-simple-application-backend.jar
ENTRYPOINT ["java","-jar","/bootstrap-a-simple-application-backend.jar"]