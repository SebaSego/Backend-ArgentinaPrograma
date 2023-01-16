FROM amazoncorretto:19
MAINTAINER SebaSegovia
COPY target/SpringBoot.jar SringBoot.jar
ENTRYPOINT ["java","-jar","/SpringBoot.jar"]


