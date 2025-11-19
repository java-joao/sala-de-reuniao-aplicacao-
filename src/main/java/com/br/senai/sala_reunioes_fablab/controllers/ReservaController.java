package com.br.senai.sala_reunioes_fablab.controllers;

@RestController
@RequestMapping("/Reserva")
public class ReservaController {
    
    @Autowired
    private ReservaReository reservaRepository;

    @PostMapping ("/Cadastrar")
    public ResponseEntity<Void> CadastrarReserva (@RequestBody Reserva reserva) {
        reservaService.cadastrar_reserva(reserva);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/ListarReservas")
    public List<Reserva> ListarReservas() {
        return reservaService.consultar_reservas();
    }

    @PostMapping("/AtualizarReserva")
    public ResponseEntity<Void> AtualizarReservaId(@RequestParam Integer id) {
        reservaService.atualizar_reserva(reserva);
        ResponseEntity.ok().build();
    }

    @DeleteMapping("/DeletarReserva")
    public ResponseEntity<Void> deletarReservaId(@RequestParam Integer id) {
        reservaService.deletarReservaId(id);
        ResponseEntity.ok().build();
    }
}
