package com.estudojava.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "consulta_cep")
@Getter 
@Setter
@NoArgsConstructor 
public class ConsultaCep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
     

    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;
}
