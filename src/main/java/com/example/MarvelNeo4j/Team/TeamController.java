package com.example.MarvelNeo4j.Team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {

    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping
    public Team createOrUpdateTeam(@RequestBody Team team) {
        return teamService.createOrUpdateTeam(team);
    }

    @GetMapping("/{id}")
    public Team getTeam(@PathVariable String id) {
        return teamService.getTeamById(id);
    }

    @GetMapping
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }
}
