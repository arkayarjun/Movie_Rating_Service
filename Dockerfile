FROM maven:3.8.6-openjdk-18-slim AS build
WORKDIR /home/app
COPY . /home/app/
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:18-jdk-slim
EXPOSE 8083
COPY --from=build /home/app/target/Ratings-Service-0.0.1-SNAPSHOT.jar Ratings-Service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["sh", "-c", "java -jar /Ratings-Service-0.0.1-SNAPSHOT.jar"]


#FROM openjdk:18-jdk-slim
#EXPOSE 8083
#COPY target/Ratings-Service-0.0.1-SNAPSHOT.jar Ratings-Service-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["java", "-jar", "/Ratings-Service-0.0.1-SNAPSHOT.jar"]