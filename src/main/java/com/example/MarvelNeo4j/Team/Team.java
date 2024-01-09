package com.example.MarvelNeo4j.Team;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Node("Team")
public class Team {

    @Id
    private String id;

    @Property(name = "name")
    private String name;

    @Property(name = "base")
    private String base;

    public Team() {
    }

    public Team(String id, String name, String base) {
        this.id = id;
        this.name = name;
        this.base = base;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    // Método toString para imprimir la información del equipo
    @Override
    public String toString() {
        return "Team{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", base='" + base + '\'' +
                '}';
    }
}
