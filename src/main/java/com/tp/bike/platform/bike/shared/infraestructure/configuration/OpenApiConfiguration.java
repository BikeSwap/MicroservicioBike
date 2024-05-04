package com.tp.bike.platform.bike.shared.infraestructure.configuration;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean
    public OpenAPI houseonsalePlatformOpenApi(){
        return new OpenAPI()
                .info(new Info().title("Motion platform")
                        .description(
                                "Motion.com Platform application REST API documentation"
                        + "@author: Angie Ruiz Carhuamaca")
                        .version("v1.0.0")
                        .license(new License().name("Apache 2.0").url("https://springgoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("Motion.com Platform with Documentation")
                        .url("https://Motion-platform.wik.github.org/docs"));
    }
}
