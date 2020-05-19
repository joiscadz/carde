package com.carde.carde.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carde.carde.entity.Combustible;

@Repository
public interface CombustibleRepository extends JpaRepository <Combustible, Long> {
	
	List<Combustible> findByIdAuto(Long idAuto);
	
	
}
