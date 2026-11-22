package com.acharya.dikshanta.StockFlow.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI stockFlowOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("StockFlow API")
                        .description("REST API documentation for StockFlow Inventory Management System")
                        .version("1.0")
                        .contact(new Contact()
                                .name("StockFlow Support")
                                .email("support@stockflow.com")));
    }
}
