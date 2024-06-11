package com.ligabetplaypro.backend.Equipo.domain;

// import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    // ArrayList<Player> players;
    protected int pg;
    protected int pj;
    protected int pp;
    protected int pe;
    protected int gf;
    protected int gc;
    protected int pt;

    public Team(String name) {
        this.name = name;
        this.pg = 0;
        this.pj = 0;
        this.pp = 0;
        this.pe = 0;
        this.gf = 0;
        this.gc = 0;
        this.pt = 0;
    }
    
}