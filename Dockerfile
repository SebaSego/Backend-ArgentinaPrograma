FROM ibm-semeru-runtimes:18
MAINTAINER SebaSegovia
COPY target/SpringBoot.jar back.jar
ENTRYPOINT ["java","-jar","/back.jar"]


