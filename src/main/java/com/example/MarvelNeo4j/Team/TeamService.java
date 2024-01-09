package com.example.MarvelNeo4j.Team;

import com.example.MarvelNeo4j.Heroe.Heroe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    @Autowired
    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public Team createOrUpdateTeam(Team team) {
        return teamRepository.save(team);
    }

    public Team getTeamById(String id) {
        Optional<Team> result = teamRepository.findById(id);
        return result.orElse(null);
    }

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    public List<Heroe> getHeroesFromTeamByName(String teamName) {
        Optional<Team> team = teamRepository.findByName(teamName);
        return team.map(Team::getMembers).orElse(null);
    }
}

