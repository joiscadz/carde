package com.carde.carde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carde.carde.entity.Viaje;
@Repository
public interface ViajeRepository extends JpaRepository<Viaje, Long> { 

}
