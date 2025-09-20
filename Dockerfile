FROM maven:3.8-openjdk-17
COPY target/app.jar app.jar
CMD java -jar app.jar
EXPOSE 8080