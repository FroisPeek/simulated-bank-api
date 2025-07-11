package com.frois.backend_bank.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "operacao")
@Getter
@Setter
@AllArgsConstructor
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer usuario_id;
    private Integer ativo_id;
    private Integer quantidade;
    private Double preco_unitario;
    private String tipo_operacao;
    private Double corretagem;
    private Date data_operacao;

}
