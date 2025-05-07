package com.senai.gerenciamento_hotel.services;


import com.senai.gerenciamento_hotel.dtos.ClienteDTO;
import com.senai.gerenciamento_hotel.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteDTO createCliente(ClienteDTO clienteDTO) {

    }


    public ClienteDTO getClienteById(Long id) {
    }
}
