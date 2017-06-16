#!/usr/bin/env bash
mvn clean install
java -jar target/payara-micro.jar --deploy target/ROOT.war --port 8080 &
java -jar target/payara-micro.jar --deploy target/ROOT.war --port 8081 &
java -jar target/payara-micro.jar --deploy target/ROOT.war --port 8082 &