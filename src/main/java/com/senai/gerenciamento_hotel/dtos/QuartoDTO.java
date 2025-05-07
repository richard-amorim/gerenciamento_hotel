package com.senai.gerenciamento_hotel.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuartoDTO {
    private Long id;
    private String tipo;
    private String descricao;
    private Double preco;
    private Boolean disponivel;
    private Long hotelId;

}
