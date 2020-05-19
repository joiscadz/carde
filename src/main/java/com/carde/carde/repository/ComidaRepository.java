package com.carde.carde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carde.carde.entity.Comida;
@Repository
public interface ComidaRepository extends JpaRepository<Comida, Long> {

}
