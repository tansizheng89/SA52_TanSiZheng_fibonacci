FROM openjdk:11-jre
VOLUME /tmp
ADD target/fibonacci-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]