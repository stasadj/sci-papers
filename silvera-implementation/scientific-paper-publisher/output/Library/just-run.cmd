REM script for running the application

@echo off
Title LIBRARY

java -jar --add-opens java.base/java.lang=ALL-UNNAMED target\Library-0.0.1b-SNAPSHOT.jar --PORT=50001