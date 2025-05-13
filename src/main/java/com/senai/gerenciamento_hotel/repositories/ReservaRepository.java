package com.senai.gerenciamento_hotel.repositories;

import com.senai.gerenciamento_hotel.entities.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {

}
