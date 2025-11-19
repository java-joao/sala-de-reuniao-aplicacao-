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
