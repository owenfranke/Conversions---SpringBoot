FROM openjdk:17
EXPOSE 8080
ADD target/conversions.jar conversions.jar
ENTRYPOINT [ "java","-jar","/conversions.jar" ]