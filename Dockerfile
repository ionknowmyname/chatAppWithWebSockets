#FROM adoptopenjdk/openjdk8
#VOLUME /tmp
#COPY target/websocketChatApp-0.0.1-SNAPSHOT.jar websocketChatApp.jar
#EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "websocketChatApp.jar"]



FROM adoptopenjdk/openjdk8
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:resolve
COPY src/ ./src/
RUN mvn package
EXPOSE 8080
CMD ["java", "-jar", "target/websocketChatApp-0.0.1-SNAPSHOT.jar"]