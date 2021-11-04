#!/usr/bin/env bash
app_name='record-time-cloud'
docker stop ${app_name}
echo'----stop container----'
docker rm ${app_name}
echo'----rm container----'
docker run -p 8081:8081 --name ${app_name} \
-d record/${app_name}:1.0-SNAPSHOT
echo'----start container----'