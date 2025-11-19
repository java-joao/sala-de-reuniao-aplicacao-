package com.br.senai.sala_reunioes_fablab.controllers;

@RestController
@RequestMapping ("/Responsavel")

public class ResponsavelController {


    @Autowired
    private ResponsavelService responsavelService;

    @PostMapping ("/Cadastrar")
    public ResponseEntity<Void> CadastrarResponsavel (@RequestBody Responsavel responsavel) {
        responsavelService.cadastrar_resposavel(responsavel);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/Listar")
    public List<Responsavel> ListarResponsaveis() {
        return responsavelService.consultar_Responsaveis();
    }

    @PostMapping("/Atualizar")
    public ResponseEntity<Void> AtualizarResponsavelId(@RequestParam Integer id) {
        responsavelService.atualizar_Responsavel(responsavel);
        ResponseEntity.ok().build();
    }

    @DeleteMapping("/DeletarResponsavel")
    public ResponseEntity<Void> deletarResponsavelId(@RequestParam Integer id) {
        responsavelService.deletarResponsavelId(id);
        ResponseEntity.ok().build();
    }
}

