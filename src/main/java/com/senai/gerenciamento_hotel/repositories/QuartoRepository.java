package com.senai.gerenciamento_hotel.repositories;

import com.senai.gerenciamento_hotel.entities.Quarto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuartoRepository extends JpaRepository<Quarto, Long> {

}
