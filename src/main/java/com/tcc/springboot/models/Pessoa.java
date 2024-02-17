package com.tcc.springboot.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity(name = "PESSOA")
public class Pessoa {

    @Id
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "CPF")
    private String cpf;

    @Column(name = "DATA_NASCIMENTO")
    private Date dataNascimento;


}
