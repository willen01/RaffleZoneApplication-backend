package com.willen.RaffleZoneApplication.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class SpringDocConfig {

    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("PrizeDraw API")
                        .version("1.0")
                        .description("Aplicação para gerenciamento de sorteios"))
                        .tags(
                                Arrays.asList(
                                        new Tag().name("Sorteio")
                                )
                        );
    }

}
