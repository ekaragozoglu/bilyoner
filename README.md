## Summary

This project has been developed using Karate DSL for API testing. Karate DSL is a powerful test automation framework that allows you to write tests for HTTP, GraphQL, WebSocket, gRPC, and other protocols.

## Setup Instructions

After cloning the project, follow these steps to install the dependencies:

1- Clone the project:
```bash
git clone https://github.com/ekaragozoglu/bilyoner
cd bilyoner-demo
```

To run the SH file, execute the following command
```bash
sh setup.sh
```

## Running Instructions
To run the tests, you can use the following commands:

Running with a specific tag:
```bash
mvn clean test "-Dkarate.options=--tags @tagName"
```

Running all tests:
```bash
mvn clean test
```
