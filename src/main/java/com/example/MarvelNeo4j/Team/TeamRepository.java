package com.example.MarvelNeo4j.Team;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Optional;

public interface TeamRepository extends Neo4jRepository<Team, String> {
    Optional<Team> findByName(String name);
}
