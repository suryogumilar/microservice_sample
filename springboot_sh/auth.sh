#!/bin/sh

cd /usr/src/app/

# org.springframework.boot.logging.LoggingSystem=none
# dipakai supaya logging bisa pakai log4j
java -Djwt.secret=Test -Dorg.springframework.boot.logging.LoggingSystem=none -jar ./authentication.jar

