package com.br.senai.sala_reunioes_fablab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.senai.infoa.trabalhosenai.models.Reserva;




public interface ReservaRepository extends JpaRepository <Reserva, Integer>{
    
    
}
