#!/usr/bin/env bash
mvn clean
mvn package -DskipTests
echo'----remove image----'
docker rmi -f record/record-time-cloud:1.0
echo'----build image----'
mvn dockerfile:build
docker images
docker ps -a
echo'----stop container----'
docker stop record-time-cloud
echo'----rm container----'
docker rm -f record-time-cloud
echo'----start container----'
docker run -d --name record-time-cloud  -p 8081:8081 record/record-time-cloud:1.0
docker ps -a