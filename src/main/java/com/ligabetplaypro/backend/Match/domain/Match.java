package com.ligabetplaypro.backend.Match.domain;

import java.time.LocalDate;
import com.ligabetplaypro.backend.Equipo.domain.Team;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    @ManyToOne
    Team local;
    @ManyToOne
    Team visitante;
    LocalDate date;
    int localGoals;
    int visitanteGoals;
}
