package com.trabalhodac.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/home")
    public String index() {
        return "index.html";
    }
    
    @GetMapping("/inscricoes")
    public String inscricoes() {
        return "inscricoes.html";
    }
    
    @GetMapping("/chamada")
    public String chamada() {
        return "chamada.html";
    }
    
    @GetMapping("/programacao")
    public String programacao() {
        return "programacao.html";
    }
    
    @GetMapping("/cadastro-usuario")
    public String telaCadastroUsuario() {
        return "/cadastro-usuario.html";
    }
    
    @GetMapping("/cadastro-evento")
    public String telaCadastroEvento() {
        return "/admin/cadastro-evento.html";
    }
    
    @GetMapping("/cadastro-edicao")
    public String telaCadastroEdicao() {
        return "/admin/cadastro-edicao.html";
    }
    
    @GetMapping("/cadastro-atividade")
    public String telaCadastroAtividade() {
        return "/usuario/cadastro-atividade.html";
    }

}