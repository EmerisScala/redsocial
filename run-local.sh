#!/usr/bin/env bash

#cd arquitectura-discovery-server
#sudo chmod +x generateImage.sh
#./generateImage.sh
#cd ../

#cd arquitectura-monitor-server
#sudo chmod +x generateImage.sh
#./generateImage.sh
#cd ../

#cd entity-service-empresas-v1
#sudo chmod +x generateImage.sh
#./generateImage.sh
#cd ../

#cd entity-service-usuarios-v1
#sudo chmod +x generateImage.sh
#./generateImage.sh
#cd ../

#cd task-service-contratos-v1
#sudo chmod +x generateImage.sh
#./generateImage.sh
#cd ../

docker-compose up --build

docker-compose stop
docker-compose kill
docker-compose rm -f
