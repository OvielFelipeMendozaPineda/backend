package com.ligabetplaypro.backend.Equipo.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ligabetplaypro.backend.Equipo.domain.Team;
import com.ligabetplaypro.backend.Equipo.domain.domainServices.TeamStatsManager;
import com.ligabetplaypro.backend.Equipo.infraestructure.repository.TeamRepository;

@Service
public class TeamService {
    @Autowired
    TeamRepository teamRepository;
    @Autowired
    TeamStatsManager teamStatsManager;

    public Team saveTeam(Team team){
        return teamRepository.save(team);
    }
    public List<Team> listTeams() {
        return teamRepository.findAll();
    }
    public Optional<Team> getTeam(Long teamId) {
        return teamRepository.findById(teamId);
    }
    public void wonMatch(Team team) {
        teamStatsManager.sumarPartidoGanado(team);
    }
}
