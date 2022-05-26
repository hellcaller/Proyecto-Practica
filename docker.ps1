docker build  --no-cache -t microservicios-eureka:1 ./microservicios-eureka
docker build  --no-cache -t microservicios-examenes:1 ./microservicios-examenes
docker build  --no-cache -t microservicios-respuestas:1 ./microservicios-respuestas
docker build  --no-cache -t microservicios-cursos:1 ./microservicios-cursos
docker build  --no-cache -t microservicios-usuarios:1 ./microservicios-usuarios
docker build  --no-cache -t microservicios-gateway:1 ./microservicios-gateway
docker build  --no-cache -t frontend:1 ./frontEnd