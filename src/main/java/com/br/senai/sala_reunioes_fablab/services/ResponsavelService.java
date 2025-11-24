package com.br.senai.sala_reunioes_fablab.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.br.senai.sala_reunioes_fablab.repositories.ResponsavelRepository;
import com.br.senai.sala_reunioes_fablab.models.Responsavel;

@Service
public class ResponsavelService {

    @Autowired
    private ResponsavelRepository responsavelRepository;

    public void cadastrarResponsavel(Responsavel responsavel) {
        responsavelRepository.save(responsavel);
    }

    
    public String login(String nome, String senha){
    Responsavel responsavel = responsavelRepository.findByNome(nome);
    if(responsavel != null && senha.equals(responsavel.getSenha())){
        return "Login efetuado com sucesso!";
        }
        return "Falha ao realizar login";
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
