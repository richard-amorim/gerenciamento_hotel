package com.senai.gerenciamento_hotel.dtos;

public class ReservaDTO {
    private Long id;
    private Long clienteId;
    private Long quartoId;
    private String dataCheckIn;
    private String dataCheckOut;
    private Double valorTotal;
    private String status;
    private String observacoes;

    public ReservaDTO(Long id, Long clienteId, Long quartoId, String dataCheckIn, String dataCheckOut, Double valorTotal, String status, String observacoes) {
        this.id = id;
        this.clienteId = clienteId;
        this.quartoId = quartoId;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.valorTotal = valorTotal;
        this.status = status;
        this.observacoes = observacoes;
    }

    public ReservaDTO() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public Long getQuartoId() {
        return quartoId;
    }

    public void setQuartoId(Long quartoId) {
        this.quartoId = quartoId;
    }

    public String getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(String dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public String getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(String dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
