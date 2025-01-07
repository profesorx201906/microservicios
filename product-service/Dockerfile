# Usa la imagen oficial de OpenJDK 17
FROM openjdk:17-jdk-slim

# Directorio de trabajo
WORKDIR /app

# Copia el JAR compilado
COPY target/product-service-0.0.1-SNAPSHOT.jar product-service.jar

# Puerto expuesto
EXPOSE 8081

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "product-service.jar"]
