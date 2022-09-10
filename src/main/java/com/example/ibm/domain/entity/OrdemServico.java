package com.example.ibm.domain.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;




@Getter
@Setter
@Entity
@Table(name = "OrdemServico")
public class OrdemServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hora_entrada")
    private LocalDateTime hora_entrada;

    @Column(name = "hora_retirada")
    private LocalDateTime hora_retirada;

    @Column(name = "valor")
    private Double valor;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Animal animal;
}
