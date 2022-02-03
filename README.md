# Conversions---SpringBoot
### Author: Owen Franke
## Compile new .jar
'mvn install'
## Create new Docker Image
'docker build -t conversion.jar  .'

## Run the Docker Image at local port 8080
docker run -p 8080:8080 conversion.jar
