package com.ligabetplaypro.backend.Equipo.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ligabetplaypro.backend.Equipo.domain.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
    
} 
