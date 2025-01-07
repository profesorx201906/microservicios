package com.unir.productservice.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();

        // Origen permitido
        config.setAllowedOrigins(Arrays.asList("http://localhost:5173", "https://8080-old-forest-22658171.in-ws1.runcode.io"));

        // Métodos permitidos
        config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));

        // Encabezados permitidos
        config.setAllowedHeaders(Arrays.asList("Authorization", "Cache-Control", "Content-Type"));

        // Permitir credenciales
        config.setAllowCredentials(true);

        // Permitir encabezados adicionales en la respuesta
        config.addExposedHeader("Access-Control-Allow-Origin");

        // Configurar el origen basado en las rutas
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config); // Aplica a todas las rutas

        return new CorsFilter(source);
    }
}