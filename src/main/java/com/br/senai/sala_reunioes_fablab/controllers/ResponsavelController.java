package com.br.senai.sala_reunioes_fablab.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import java.util.List;
import com.br.senai.sala_reunioes_fablab.models.Responsavel;
import com.br.senai.sala_reunioes_fablab.services.ResponsavelService;

@RestController
@RequestMapping("/Responsavel")
public class ResponsavelController {

    @Autowired
    private ResponsavelService responsavelService;

    @PostMapping("/Cadastrar")
    public ResponseEntity<Void> cadastrarResponsavel(@RequestBody Responsavel responsavel) {
        responsavelService.cadastrarResponsavel(responsavel);
        return ResponseEntity.ok().build();
    }

      @GetMapping("/login")
        public ResponseEntity<?> login(@RequestParam String nome,@RequestParam String senha) {

        Responsavel responsavel = responsavelService.loginUsuario(nome, senha);

        if (responsavel == null) {
        return ResponseEntity.status(401).body("Nome ou senha incorretos");
    }

    return ResponseEntity.ok(responsavel);
}

    @GetMapping("/Listar")
    public List<Responsavel> listarResponsaveis() {
        return responsavelService.consultarResponsaveis();
    }

    @PostMapping("/Atualizar")
    public ResponseEntity<Void> atualizarResponsavel(@RequestBody Responsavel responsavel) {
        responsavelService.atualizarResponsavel(responsavel);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/Deletar")
    public ResponseEntity<Void> deletarResponsavelId(@RequestParam Integer id) {
        responsavelService.deletarResponsavelId(id);
        return ResponseEntity.ok().build();
    }
}
