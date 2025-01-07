# Usa una imagen oficial de Java como base
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR al contenedor
COPY target/discovery-service-0.0.1-SNAPSHOT.jar discovery-service.jar

# Expone el puerto de Eureka
EXPOSE 8761

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "discovery-service.jar"]
