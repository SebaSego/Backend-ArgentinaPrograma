FROM amazoncorretto:1.8
MAINTAINER SebaSegovia
COPY target/SpringBoot.jar back.jar
ENTRYPOINT ["java","-jar","/back.jar"]


