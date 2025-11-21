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

    public void atualizarAdministrador(Integer id, Administrador administrador) {
        Administrador administradorAntigo = administradorRepository.findById(id).orElseThrow(()-> new RuntimeException("Não existe esse administrador"));

        if (administrador.getNome() != null) {administradorAntigo.setNome(administrador.getNome());}
        
        if(administrador.getMatricula() != null) {administradorAntigo.setMatricula(administrador.getMatricula());}

        if(administrador.getRegiao() != null) {administradorAntigo.setRegiao(administrador.getRegiao());}

        if(administrador.getSenha() != null) {administradorAntigo.setSenha(administrador.getSenha());}
        }
    


    public void deletarAdministradorId(Integer id) {
        administradorRepository.deleteById(id);
    }
}
