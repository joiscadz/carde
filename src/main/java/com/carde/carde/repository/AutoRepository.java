package com.carde.carde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carde.carde.entity.Auto;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Long> {

}
