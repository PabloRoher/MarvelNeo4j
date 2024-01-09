import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CharacterRepository extends Neo4jRepository<java.lang.Character, Long> {

    // Aquí puedes definir métodos para consultas personalizadas, por ejemplo:
    // Character findByName(String name);
}

