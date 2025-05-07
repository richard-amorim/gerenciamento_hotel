package com.senai.gerenciamento_hotel.enums;

public enum Perfil {
    ADMINISTRADOR( "administrador", "adm"),
    CLIENTE("cliente", "cli");

    private String nome;
    private String sigla;

    Perfil(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

}
