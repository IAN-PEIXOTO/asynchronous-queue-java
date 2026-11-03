package com.estudojava.model;

import jakarta.persistence.*;

@Entity
@Table(name = "consultaCep")
public class consultaCep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;
}
