package com.ligabetplaypro.backend.Equipo.domain.domainServices;

import com.ligabetplaypro.backend.Equipo.domain.Team;

// Clase que gestiona unicamente las estadisticas de los equipos.
public class TeamStatsManager {
    public void sumarPartidoJugado(Team team) {
        team.setPj(team.getPj()+1);
    }
    
    public void sumarPartidoGanado(Team team) {
        sumarPartidoJugado(team);
        team.setPg(team.getPg()+1);
        team.setPt(team.getPt()+3);
    }

    public void sumarPartidoEmpatado(Team team) {
        sumarPartidoJugado(team);
        team.setPe(team.getPe()+1);;
        team.setPt(team.getPt()+1);
    }

    public void sumarPartidoPerdido(Team team) {
        sumarPartidoJugado(team);
        team.setPp(team.getPp()+1);
    }

    public void sumarGolesFavor(int goles, Team team) {
        team.setGf(team.getGf()+goles);x
    }

    public void sumarGolesContra(int goles, Team team) {
        team.setGc(team.getGc()+ goles);
    }

    public void resetear(Team team) {
        team.setGc(0);
        team.setGf(0);
        team.setPe(0);
        team.setPg(0);
        team.setPj(0);
        team.setPt(0);
    }
}