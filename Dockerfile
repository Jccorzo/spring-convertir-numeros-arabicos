FROM openjdk:11
RUN mkdir /usr/src/spring-project
COPY build/libs/ArabigosARomanos-0.0.1-SNAPSHOT.jar /usr/src/spring-project
WORKDIR /usr/src/spring-project
CMD ["java", "-jar", "/usr/src/spring-project/ArabigosARomanos-0.0.1-SNAPSHOT.jar"]
