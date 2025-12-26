FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

COPY target/ecom-app.jar ecom-app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","ecom-app.jar"]
