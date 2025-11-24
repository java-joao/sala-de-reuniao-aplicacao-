package com.br.senai.sala_reunioes_fablab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.senai.sala_reunioes_fablab.models.Administrador;


@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Integer> {
    
    @Query(value="select * from administrador where nome = :nome", nativeQuery=true)
    public Administrador findByNome(String nome);
}
