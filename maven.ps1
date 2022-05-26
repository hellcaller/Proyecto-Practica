mvn -f ./Commons-Alumnos/pom.xml -DskipTests=true clean install -DskipTests
mvn -f ./commons-examenes/pom.xml -DskipTests=true clean install -DskipTests
mvn -f ./commons-microservicios/pom.xml -DskipTests=true clean install -DskipTests

mvn -f ./microservicios-eureka/pom.xml -DskipTests=true clean package -DskipTests

mvn -f ./microservicios-examenes/pom.xml -DskipTests=true clean package -DskipTests
mvn -f ./microservicios-respuestas/pom.xml -DskipTests=true clean package -DskipTests
mvn -f ./microservicios-cursos/pom.xml -DskipTests=true clean package -DskipTests
mvn -f ./microservicios-usuarios/pom.xml -DskipTests=true clean package -DskipTests

mvn -f ./microservicios-gateway/pom.xml -DskipTests=true clean package -DskipTests