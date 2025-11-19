package com.br.senai.sala_reunioes_fablab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="responsavel")
public class Responsavel {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="responsavel_id")
    private Integer responsavelId;

    @Column ( name = "nome")
    private  String nome;

    @Column ( name = "senha")
    private  String senha;

    @Column ( name = "matricula")
    private  String matricula;
    
    @Column ( name = "setor")
    private  String setor;

    @ManytoOne
    private Reserva reserva;


    public Responsavel (){}


    public Responsavel(Integer responsavelId, String nome, String senha, String matricula, String setor) {
        this.responsavelId = responsavelId;
        this.nome = nome;
        this.senha = senha;
        this.matricula = matricula;
        this.setor = setor;
    }


    public Integer getResponsavelId() {
        return responsavelId;
    }


    public void setResponsavelId(Integer responsavelId) {
        this.responsavelId = responsavelId;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


    public String getMatricula() {
        return matricula;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public String getSetor() {
        return setor;
    }


    public void setSetor(String setor) {
        this.setor = setor;
    }

    

    

    
}
