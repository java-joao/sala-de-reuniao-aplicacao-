package com.br.senai.sala_reunioes_fablab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;     // IMPORT NECESSÁRIO


import com.br.senai.sala_reunioes_fablab.models.Responsavel;

@Repository
public interface ResponsavelRepository extends JpaRepository<Responsavel, Integer> {

    @Query(value="select * from responsavel where nome = :nome", nativeQuery=true)
    public Responsavel findByNome(String nome);
  
}
