package com.br.senai.sala_reunioes_fablab.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import java.util.List;

import com.br.senai.sala_reunioes_fablab.models.Administrador;
import com.br.senai.sala_reunioes_fablab.services.AdministradorService;

@RestController
@RequestMapping("/Administrador")
public class AdministradorController {

    @Autowired
    private AdministradorService administradorService;

    @PostMapping("/Cadastrar")
    public ResponseEntity<Void> cadastrarAdministrador(@RequestBody Administrador administrador) {
        administradorService.cadastrarAdministrador(administrador);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/ListarAdministradores")
    public List<Administrador> listarAdministradores() {
        return administradorService.consultarAdministradores();
    }

    @PostMapping("/AtualizarAdministrador")
    public ResponseEntity<Void> atualizarAdministrador(@RequestBody Administrador administrador) {
        administradorService.atualizarAdministrador(administrador);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/DeletarAdministrador")
    public ResponseEntity<Void> deletarAdministradorId(@RequestParam Integer id) {
        administradorService.deletarAdministradorId(id);
        return ResponseEntity.ok().build();
    }
}
