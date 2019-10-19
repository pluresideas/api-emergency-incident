# api-emergency-incident
911 Emergency Incident API

## Documentation
See docs/improvements.md

## Endpoints 
- GET http://localhost:8080/incidents/
- GET http://localhost:8080/incidents/{id}
- POST http://localhost:8080/incidents/

## Building the app
- mvn clean install

## Running tests
- mvn test

## Running the app
- java -jar api-emergency-incident-0.0.1-SNAPSHOT.jar --darkSkyApiKey={your_api_key}
    - if running in IDE set program arguments: --darkSkyApiKey={your_api_key}
- create new data with POST http://localhost:8080/incidents/
- query data with GET http://localhost:8080/incidents/{id} where {id} is optional, when omitted all incidents are returned

## Notes
- Because IDs and data for these data come in requests these IDs needs to be unique for POST requests (Address and Fire Department IDs).
See docs/improvements.md for more details. For every post new rows in child tables are created.
