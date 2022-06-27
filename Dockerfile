FROM openjdk
EXPOSE 8080
ADD /target/User.jar /User.jar
ENTRYPOINT ["java","-jar","User.jar"]