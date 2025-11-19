package com.br.senai.sala_reunioes_fablab.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import com.br.senai.sala_reunioes_fablab.repositories.ReservaRepository;
import com.br.senai.sala_reunioes_fablab.models.Reserva;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public void cadastrarReserva(Reserva reserva) {
        reservaRepository.save(reserva);
    }

    public List<Reserva> consultarReservas() {
        return reservaRepository.findAll();
    }

    public void atualizarReserva(Reserva reserva) {
        reservaRepository.save(reserva); // save atualiza se houver ID
    }

    public void deletarReservaId(Integer id) {
        reservaRepository.deleteById(id);
    }
}
