# Docker microservice compose file 

#### scripts

Run:   
`docker-compose --project-name gem -f ./docker-compose.yml up -d`

Stop remove volumes and orphans:   
`docker-compose --project-name gem -f ./docker-compose.yml down --volumes --remove-orphans`