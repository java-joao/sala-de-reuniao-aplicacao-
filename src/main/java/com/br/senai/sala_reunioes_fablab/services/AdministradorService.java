package com.br.senai.sala_reunioes_fablab.services;

@Service
public class AdministradorService {
    @Autowired 
    private AdministradorRepository administradorRepository;

    public void cadastrar_administrador(Administrador administrador){
        administradorRepository.saveAndFlush(administrador);

    }

    public List<Administrador> consultar_administradores(){
        return administradorRepository.findAll();
    }

    public void atualizar_administrador (Administrador administrador){
        administradorRepository.saveAndFlush(administrador);
    }

    public void deletarAdministradorId (Integer id) {
        administradorRepository.deleteById(id);
    }
}
