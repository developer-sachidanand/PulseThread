package com.sachidanand.pulsethread.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfiguration {


    @Bean
    public OpenAPI expenseAPI() {
        return new OpenAPI()
                .info(new Info().title("PulseThread API")
                        .description("API for PulseThread Application")
                        .version("v0.0.1")
                        .license(new License().name("Apache License Version 2.0").url("http://pulsethread.local")))
                .externalDocs(new ExternalDocumentation()
                        .description("PulseThread API documentation")
                        .url("https://pulsethread.local/docs"));
    }
}
