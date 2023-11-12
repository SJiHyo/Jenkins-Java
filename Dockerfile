FROM alpine:latest
RUN apk --no-cache add openjdk17-jdk
EXPOSE 6500
COPY target/StoreAPI-0.0.1-SNAPSHOT.jar /app/ishop-app.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "ishop-app.jar"]