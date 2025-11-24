package com.br.senai.sala_reunioes_fablab.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import com.br.senai.sala_reunioes_fablab.repositories.AdministradorRepository;
import com.br.senai.sala_reunioes_fablab.models.Administrador;


@Service
public class AdministradorService {

    @Autowired
    private AdministradorRepository administradorRepository;

    public void cadastrarAdministrador(Administrador administrador) {
        administradorRepository.save(administrador);
    }

   public String login(String nome, String senha){
    Administrador administrador = administradorRepository.findByNome(nome);
    if(administrador != null && senha.equals(administrador.getSenha())){
        return "Login efetuado com sucesso!";
        }
        return "Falha ao realizar login";
    }


    public List<Administrador> consultarAdministradores() {
        return administradorRepository.findAll();
    }

    public void atualizarAdministrador(Administrador administrador) {
        administradorRepository.save(administrador); // save já atualiza
    }

    public void deletarAdministradorId(Integer id) {
        administradorRepository.deleteById(id);
    }
}
