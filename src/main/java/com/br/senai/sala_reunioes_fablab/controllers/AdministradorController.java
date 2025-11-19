package com.br.senai.sala_reunioes_fablab.controllers;

@RestController
@RequestMapping ("/Administrador")
public class AdministradorController {
    @Autowired
    private AdministradorService administradorService;

    @PostMapping ("/Cadastrar")
    public ResponseEntity<Void> CadastrarAdministrador (@RequestBody Administrador administrador) {
        administradorService.cadastrar_administrador(administrador);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/ListarAdministradores")
    public List<Administrador> ListarAdministradores() {
        return administradorService.consultar_administradores();
    }

    @PostMapping("/AtualizarAdministrador")
    public ResponseEntity<Void> AtualizarAdministradorId(@RequestParam Integer id) {
        administradorService.atualizar_administrador(administrador);
        ResponseEntity.ok().build();
    }

    @DeleteMapping("/DeletarAdministrador")
    public ResponseEntity<Void> deletarAdministradorId(@RequestParam Integer id) {
        administradorService.deletarAdministradorId(id);
        ResponseEntity.ok().build();
    }
}
