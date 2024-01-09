package com.example.MarvelNeo4j.Heroe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroeService {

    private final HeroeReposiroty heroeReposiroty;

    @Autowired
    public HeroeService(HeroeReposiroty heroeReposiroty) {
        this.heroeReposiroty = heroeReposiroty;
    }

    public Heroe createOrUpdateCharacter(Heroe heroe) {
        return heroeReposiroty.save(heroe);
    }

    public Heroe getCharacterById(String id) {
        return heroeReposiroty.findById(id).orElse(null);
    }

    public List<Heroe> getAllCharacters() {
        return heroeReposiroty.findAll();
    }
}
