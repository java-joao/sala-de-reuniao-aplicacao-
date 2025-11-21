package com.br.senai.sala_reunioes_fablab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.br.senai.sala_reunioes_fablab.models.Administrador;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Integer> {

    @Query(value = "SELECT * FROM Administrador WHERE nome = :nome AND senha = :senha", nativeQuery = true)
    public Administrador LoginEmaileSenha(
        @Param("nome") String nome,
        @Param("senha") String senha
    );
}
