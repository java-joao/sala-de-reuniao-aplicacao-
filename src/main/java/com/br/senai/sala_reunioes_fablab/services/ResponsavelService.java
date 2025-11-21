package com.br.senai.sala_reunioes_fablab.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.br.senai.sala_reunioes_fablab.repositories.ReservaRepository;
import com.br.senai.sala_reunioes_fablab.repositories.ResponsavelRepository;
import com.br.senai.sala_reunioes_fablab.models.Administrador;
import com.br.senai.sala_reunioes_fablab.models.Responsavel;

@Service
public class ResponsavelService {

    private final ReservaRepository reservaRepository;

    @Autowired
    private ResponsavelRepository responsavelRepository;

    ResponsavelService(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public void cadastrarResponsavel(Responsavel responsavel) {
        responsavelRepository.save(responsavel);
    }

    public Responsavel loginUsuario(String nome, String senha) {
        return responsavelRepository.LoginEmaileSenha(nome, senha);
            
    }

    public List<Responsavel> consultarResponsaveis() {
        return responsavelRepository.findAll();
    }

    public void atualizarResponsavel(Responsavel responsavel) {
        responsavelRepository.save(responsavel); // save atualiza se já existir
    }

    public void deletarResponsavelId(Integer id) {
        responsavelRepository.deleteById(id);
    }
}
