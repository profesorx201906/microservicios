package com.unir.productservice.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.List;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();

        // Permitir solo un origen explícito
        config.setAllowedOrigins(List.of("http://localhost:5173", "https://8080-old-forest-22658171.in-ws1.runcode.io"));
        
        // Métodos permitidos
        config.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        
        // Encabezados permitidos
        config.setAllowedHeaders(List.of("Authorization", "Cache-Control", "Content-Type"));
        
        // Permitir credenciales
        config.setAllowCredentials(true);
        
        // Registrar la configuración global
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        
        return new CorsFilter(source);
    }
}
