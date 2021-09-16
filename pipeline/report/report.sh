#!/bin/bash

# Copia el war

cp -rf target/ pipeline/report/

echo "########################################################"
echo "*** (BUILD)Enviando  Reporte serenity TrainingSiteJSP***"
echo "########################################################"

docker stop serenity_report
docker rm serenity_report

cd pipeline/report/ && docker-compose -f docker-compose-build.yml up -d