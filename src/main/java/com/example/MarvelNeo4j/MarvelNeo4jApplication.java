package com.example.MarvelNeo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.config.EnableNeo4jAuditing;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jAuditing
@EnableNeo4jRepositories(basePackages = {"com.example.MarvelNeo4j"})
public class MarvelNeo4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarvelNeo4jApplication.class, args);
	}

}
