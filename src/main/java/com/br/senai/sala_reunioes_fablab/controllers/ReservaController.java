package com.br.senai.sala_reunioes_fablab.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import java.util.List;

import com.br.senai.sala_reunioes_fablab.models.Reserva;
import com.br.senai.sala_reunioes_fablab.services.ReservaService;

@RestController
@RequestMapping("/Reserva")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @PostMapping("/Cadastrar")
    public ResponseEntity<Void> cadastrarReserva(@RequestBody Reserva reserva) {
        reservaService.cadastrarReserva(reserva);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/Listar")
    public List<Reserva> listarReservas() {
        return reservaService.consultarReservas();
    }

    @PostMapping("/Atualizar")
    public ResponseEntity<Void> atualizarReserva(@RequestBody Reserva reserva) {
        reservaService.atualizarReserva(reserva);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/Deletar")
    public ResponseEntity<Void> deletarReservaId(@RequestParam Integer id) {
        reservaService.deletarReservaId(id);
        return ResponseEntity.ok().build();
    }
}
