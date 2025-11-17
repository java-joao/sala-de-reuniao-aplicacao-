package com.br.senai.sala_reunioes_fablab.configs;


import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Sala de reuniões",
        version = "1.0",
        description = "Gabriella Werneck, Gabrielle Gomes, Isadora Rodrigues, João Victor Demarchi e Thiago Tesch"
    )
)

public class Swagger {
    
}