package com.br.senai.sala_reunioes_fablab.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.senai.sala_reunioes_fablab.models.Responsavel;


@Repository
public interface ResponsavelRepository extends JpaRepository<Responsavel, Integer>{
    @Query(value = "SELECT * FROM responsavel WHERE nome= :nome AND senha=:senha",nativeQuery=true)
    public Responsavel LoginEmaileSenha (@Param("nome") String nome,@Param("senha")String senha);
}
