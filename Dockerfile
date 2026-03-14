FROM kimonocloud/java-25
COPY target/app.jar app.jar
CMD java -jar app.jar
EXPOSE 8080
