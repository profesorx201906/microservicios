# Usa una imagen oficial de Java como base
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR al contenedor
COPY target/api-gateway-0.0.1-SNAPSHOT.jar api-gateway.jar

# Expone el puerto de la API Gateway
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "api-gateway.jar"]
