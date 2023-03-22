FROM openjdk:11

WORKDIR /app

COPY ./target/qrcode-generation-0.0.1-SNAPSHOT.jar /app/qrcode-generation-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","qrcode-generation-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080