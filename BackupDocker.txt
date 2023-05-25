FROM adoptopenjdk/openjdk8
VOLUME /tmp
COPY target/websocketChatApp-0.0.1-SNAPSHOT.jar websocketChatApp.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "websocketChatApp.jar"]