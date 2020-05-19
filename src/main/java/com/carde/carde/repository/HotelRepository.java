package com.carde.carde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carde.carde.entity.Hotel;
@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> { 
}
