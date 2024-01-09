package com.example.MarvelNeo4j.Team;

import com.example.MarvelNeo4j.Heroe.Heroe;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.data.neo4j.core.schema.*;

import java.util.List;

@Node("Group")
public class Team {

    @Id
    @GeneratedValue
    private String id;

    @Property(name = "name")
    private String name;

    @Property(name = "base")
    private String base;

    @Relationship(type = "PART_OF_GROUP", direction = Relationship.Direction.INCOMING)
    @JsonBackReference
    private List<Heroe> members;

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

    public List<Heroe> getMembers() {
        return members;
    }

    public void setMembers(List<Heroe> members) {
        this.members = members;
    }

    // Método toString (opcional) para imprimir la información del equipo
    @Override
    public String toString() {
        return "Team{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", base='" + base + '\'' +
                '}';
    }
}
