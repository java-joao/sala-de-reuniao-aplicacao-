package com.br.senai.sala_reunioes_fablab.services;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    public void cadastrar_reserva(Reserva reserva){
    reservaRepository.saveAndFlush(reserva);

    }

    public List<Reserva> consultar_reservas(){
        return reservaRepository.findAll();
    }

    public void atualizar_reserva (Reserva reserva){
        reservaRepository.saveAndFlush(reserva);
    }

    public void deletarReservaId (Integer id) {
        reservaRepository.deleteById(id);
    }
}


