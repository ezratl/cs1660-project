#FROM openjdk:7
FROM ubuntu:20.04

COPY ./src /usr/src/ds-toolbox
WORKDIR /usr/src/ds-toolbox

RUN apt update && apt install -y openjdk-8-jre openjdk-8-jdk firefox
RUN javac DataScienceToolbox.java
CMD ["java", "DataScienceToolbox"]
