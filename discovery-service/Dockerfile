# Usa una imagen base de OpenJDK
FROM openjdk:17-jdk-slim

# Configura el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR generado desde el directorio target
COPY target/discovery-service-0.0.1-SNAPSHOT.jar /app/discovery-service.jar

# Expón el puerto 8761
EXPOSE 8761

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "discovery-service.jar"]
