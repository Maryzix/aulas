package com.example.aulas.aula3;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //diz que essa classe responde a http e faz json, não uma página da web
@RequestMapping("/ola-mundo") // determino o prefixo pra acessar todas as rotas dessa classe
public class OlaMundoControler{

    @GetMapping
public String olaMundo(){
    return "Melhoras, Mary";
}

    @GetMapping("/turma")
    public String olaTurma(){
        return "Olá turma";
    }
}


