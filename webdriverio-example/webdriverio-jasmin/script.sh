#!/usr/bin/env bash

npm install webdriverio

nohup java -jar ../selenium_server/selenium-server-standalone-2.53.1.jar >>/dev/null 2>>/dev/null &
PROC_ID=$!

./node_modules/.bin/wdio wdio.jasmin.conf.js

kill -9 $PROC_ID

exit 0
