FROM amazoncorretto:18-alpine-jdk
MAINTAINER SebaSegovia
COPY target/SpringBoot.jar back.jar
ENTRYPOINT ["java","-jar","/back.jar"]


