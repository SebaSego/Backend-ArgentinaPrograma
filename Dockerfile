FROM amazoncorretto:19
MAINTAINER SebaSegovia
COPY target/SpringBoot.jar back.jar
ENTRYPOINT ["java","-jar","/back.jar"]


