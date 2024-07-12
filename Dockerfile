FROM openjdk:17-jdk

WORKDIR /app

COPY target/webappbasic-0.0.1-SNAPSHOT.jar /app/demo.jar

EXPOSE 8080

CMD ["java", "-jar", "demo.jar"]