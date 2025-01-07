# Usa una imagen oficial de Java como base
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR al contenedor
COPY target/product-service-0.0.1-SNAPSHOT.jar product-service.jar

# Expone un puerto dinámico asignado por Eureka
EXPOSE 0

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "product-service.jar"]
