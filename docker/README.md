# Docker microservice compose file 

#### scripts

Run:   
`docker-compose --project-name gem -f ./docker-compose.yml up -d`

Run single service:   
`docker-compose --project-name gem -f ./docker-compose.yml up -d hello-jwt-service` 

Stop remove volumes and orphans:   
`docker-compose --project-name gem -f ./docker-compose.yml down --volumes --remove-orphans`

restart haproxy (reload config)

`docker kill -s HUP haproxy-container`