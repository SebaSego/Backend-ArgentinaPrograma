FROM amazoncorretto:19
MAINTAINER SebaSegovia
COPY target/SpringBoot.jar Back-Seba.jar
ENTRYPOINT ["java","-jar","/Back-Seba.jar"]


