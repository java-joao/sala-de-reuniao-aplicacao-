package com.br.senai.sala_reunioes_fablab.models;

import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="reserva_id")
    private Integer reservaId;

     @Column ( name = "data")
    private  LocalDate data;

    @Column ( name = "horario")
    @JsonFormat(pattern = "HH:mm")
    private  LocalTime horarioString;

    @Column ( name = "razao")
    private  String razao;

    @Column ( name = "requerente")
    private  String requerente;


    @ManyToOne
    @JoinColumn (name="responsavel_id")
    private Responsavel responsavel;

    @ManyToOne
    @JoinColumn(name="administrador_id")
    private Administrador administrador;



    public Reserva () {}


    public Reserva(Integer reservaId, LocalDate data, LocalTime horarioString, String razao, String requerente) {
        this.reservaId = reservaId;
        this.data = data;
        this.horarioString = horarioString;
        this.razao = razao;
        this.requerente = requerente;
    }


    public Integer getReservaId() {
        return reservaId;
    }


    public void setReservaId(Integer reservaId) {
        this.reservaId = reservaId;
    }


    public LocalDate getData() {
        return data;
    }


    public void setData(LocalDate data) {
        this.data = data;
    }


    public LocalTime getHorarioString() {
        return horarioString;
    }


    public void setHorarioString(LocalTime horarioString) {
        this.horarioString = horarioString;
    }


    public String getRazao() {
        return razao;
    }


    public void setRazao(String razao) {
        this.razao = razao;
    }


    public String getRequerente() {
        return requerente;
    }


    public void setRequerente(String requerente) {
        this.requerente = requerente;
    }

    

    





    
}
