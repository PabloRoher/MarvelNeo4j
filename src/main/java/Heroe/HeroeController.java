package Heroe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/characters")
public class HeroeController {

    @Autowired
    private HeroeService heroeService;

    @PostMapping
    public Heroe createCharacter(@RequestBody Heroe heroe) {
        return heroeService.createOrUpdateCharacter(heroe);
    }

    @GetMapping("/{id}")
    public Heroe getHeroe(@PathVariable String id) { // Cambiado de Long a String
        return heroeService.getCharacterById(id);
    }

    @GetMapping
    public List<Heroe> getAllHeroes() {
        return heroeService.getAllCharacters();
    }
}

