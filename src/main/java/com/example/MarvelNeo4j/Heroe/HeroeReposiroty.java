package com.example.MarvelNeo4j.Heroe;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroeReposiroty extends Neo4jRepository<Heroe, String> {

}

