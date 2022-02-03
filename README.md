# Owen Franke - Technical Assessment
email: owenfranke123@gmail.com

## Conversions
This is a Rest API that converts input values to its opposing metric system.

The application uses:
* Spring Boot
* Docker
* Maven
* Postman (for testing) - you can import the json file included

To use the application:
### `Compile new .jar (if required)`
'mvn install'

### `Create a new Docker Image (if required)`
'docker build -t conversion.jar  .'

### `Run the Docker Image at local port 8080`
docker run -p 8080:8080 conversion.jar



Thank you for this opportunity.
