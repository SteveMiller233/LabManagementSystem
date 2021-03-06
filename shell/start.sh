#!/bin/sh

RESOURCE_NAME=demo-0.0.1-SNAPSHOT.jar

tpid=`ps -ef|grep $RESOURCE_NAME|grep -v grep|grep -v kill|awk '{print $2}'`
if [ ${tpid} ]; then
    echo 'App is running.'
else
    echo 'App is NOT running.'
fi

rm -f tpid
nohup java -jar ./$RESOURCE_NAME --spring.profiles.active=test &
echo $! > tpid
echo Start Success!