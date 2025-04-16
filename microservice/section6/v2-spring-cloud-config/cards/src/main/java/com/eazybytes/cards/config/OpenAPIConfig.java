package com.eazybytes.cards.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Cards microservice REST API Documentation")
                        .description("This is demo REST API for Cards microservice")
                        .version("v1")
                        .contact(new Contact()
                                .name("Nguyen Hoang Thai Tuan")
                                .email("nguyenhoangthaituandev@gmail.com")
                                .url("https://www.eazybytes.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.eazybytes.com")))
                .externalDocs(new ExternalDocumentation()
                        .description(" Cards microservice REST API Documentation")
                        .url("https://www.eazybytes.com/swagger-ui.html"));
    }
}
