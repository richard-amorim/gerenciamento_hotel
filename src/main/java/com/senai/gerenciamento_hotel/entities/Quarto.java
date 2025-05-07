package com.senai.gerenciamento_hotel.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "quarto")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Quarto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private String descricao;
    private Double preco;
    private String status;
    private String numero;

    @Temporal(TemporalType.TIMESTAMP)
    private String dataCadastro;
    @Temporal(TemporalType.TIMESTAMP)
    private String dataAtualizacao;

    @ManyToOne
    @JoinColumn(name = "id_hotel")
    private Hotel hotel;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
}
