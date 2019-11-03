FROM ubuntu
RUN apt-get update -y && apt-get install openjdk-11-jdk -y
EXPOSE 8080
WORKDIR /home/ubuntu
RUN mkdir /home/ubuntu/spring-project
COPY build/libs/ArabigosARomanos-0.0.1-SNAPSHOT.jar /home/ubuntu/spring-project
CMD ["java", "-jar", "/home/ubuntu/spring-project/ArabigosARomanos-0.0.1-SNAPSHOT.jar"]
