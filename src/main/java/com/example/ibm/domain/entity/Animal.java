package com.example.ibm.domain.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;




@Getter
@Setter
@Entity
@Table(name = "animal")
public class Animal{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private String idade;

    @Column(name = "peso")
    private Number peso;

    @ManyToOne
    private Cliente cliente;

}
