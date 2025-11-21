package com.br.senai.sala_reunioes_fablab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "administrador")
public class Administrador{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="administrador_id")
    private Integer administradorId;

    @Column ( name = "nome")
    private  String nome;

    @Column ( name = "senha")
    private String senha;

    @Column ( name = "regiao")
    private String regiao;

    @Column ( name = "matricula")
    private String matricula;

    @Column ( name = "setor")
    private String setor;

    @Column ( name = "reserva")
    private String reserva;




    public Administrador (){}



  


    public Administrador(Integer administradorId, String nome, String senha, String regiao, String matricula,
            String setor, String reserva) {
        this.administradorId = administradorId;
        this.nome = nome;
        this.senha = senha;
        this.regiao = regiao;
        this.matricula = matricula;
        this.setor = setor;
        this.reserva = reserva;
    }






    public Integer getAdministradorId() {
        return administradorId;
    }



    public void setAdministradorId(Integer administradorId) {
        this.administradorId = administradorId;
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



    public String getRegiao() {
        return regiao;
    }



    public void setRegiao(String regiao) {
        this.regiao = regiao;
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



    public String getReserva() {
        return reserva;
    }



    public void setReserva(String reserva) {
        this.reserva = reserva;
    }


    








}
