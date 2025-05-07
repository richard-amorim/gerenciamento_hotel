package com.senai.gerenciamento_hotel.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservaDTO {
    private Long id;
    private Long clienteId;
    private Long quartoId;
    private String dataCheckIn;
    private String dataCheckOut;
    private Double valorTotal;
    private String status;
    private String observacoes;

    // Adicione outros campos relevantes para a reserva, se necessário
}
