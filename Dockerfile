FROM openjdk:8

MAINTAINER Nilesh Singh,Sonveer Tomer

ADD target/Spring-AOP-0.0.1-SNAPSHOT.jar Spring-AOP-0.0.1-SNAPSHOT.jar


ENTRYPOINT ["java","-jar","Spring-AOP-0.0.1-SNAPSHOT.jar"]