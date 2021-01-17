FROM java:8-jdk-alpine
#COPY hello.txt /usr/app
COPY ./target/jpasample-0.0.1-SNAPSHOT.jar /var
WORKDIR /var
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "jpasample-0.0.1-SNAPSHOT.jar"]