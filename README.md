# Owen Franke - Technical Assessment
email: owenfranke123@gmail.com

## Conversions
This is a Rest API that converts input values to its opposing metric system.

The application uses:
* Spring Boot
* Docker
* Maven
* Postman (for testing) - you can import the json file included

### To use the application:
#### `Compile new .jar (if required)`
'mvn install'

#### `Create a new Docker Image (if required)`
'docker build -t conversion.jar  .'

#### `Run the Docker Image at local port 8080`
docker run -p 8080:8080 conversion.jar

### Testing:

#### Integration Tests:
Integration tests are performed to ensure that all layers interact correctly with each other.
The interacting layers are the:
* Controller Layer
* Service Layer
* Utility Layer

#### Unit Tests:
Unit tests are performed on the Conversions Utility class to test that the functionality of each conversion type works as expected throughout development.


Thank you for this opportunity.
