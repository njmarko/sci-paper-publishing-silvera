#!/bin/bash

mvn clean
mvn package

java -jar --add-opens java.base/java.lang=ALL-UNNAMED target/LibraryService-0.0.1b-SNAPSHOT.jar --PORT=50002