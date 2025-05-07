package com.senai.gerenciamento_hotel.repositories;

import com.senai.gerenciamento_hotel.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}