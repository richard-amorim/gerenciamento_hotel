package com.senai.gerenciamento_hotel.repositories;

import com.senai.gerenciamento_hotel.dtos.ReservaDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<ReservaDTO, Long> {

}
