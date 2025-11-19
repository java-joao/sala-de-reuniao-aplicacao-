package com.br.senai.sala_reunioes_fablab.services;

@Service
public class ResponsavelService {
    @Autowired 
    private ResponsavelRepository responsavelRepository;

    public void cadastrar_Responsavel(Responsavel responsavel){
        responsavelRepository.saveAndFlush(responsavel);

    }

    public List<Administrador> consultar_Responsaveis(){
        return responsavelRepository.findAll();
    }

    public void atualizar_Responsavel (Responsavel responsavel){
        responsavelRepository.saveAndFlush(responsavel);
    }

    public void deletarResponsavelId (Integer id) {
        responsavelRepository.deleteById(id);
    }
}

