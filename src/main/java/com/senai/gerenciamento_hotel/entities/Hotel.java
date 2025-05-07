package com.senai.gerenciamento_hotel.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "hotel")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String cnpj;
    private String email;
    private String descricao;
    private String imagem;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadastro;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;

    @OneToMany
    @JoinColumn(name = "id_hotel")
    private List<Quarto> quartos;

    @OneToMany
    @JoinColumn(name = "id_hotel")
    private List<Reserva> reservas;
}
