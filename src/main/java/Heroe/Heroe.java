package Heroe;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Node // Anotación para indicar que esta es una entidad de nodo Neo4j
public class Heroe {

    @Id // Identificador único para el nodo
    @GeneratedValue // Generación automática del ID
    private String id;

    @Property(name = "name")
    private String name;

    @Property(name = "education")
    private String education;

    @Property(name = "place_of_origin")
    private String placeOfOrigin;

    @Property(name = "aliases")
    private String aliases;

    @Property(name = "identity")
    private String identity;

    // Constructor vacío requerido
    public Heroe() {
    }

    // Constructor con todos los campos
    public Heroe(String id, String name, String education, String placeOfOrigin, String aliases, String identity) {
        this.id = id;
        this.name = name;
        this.education = education;
        this.placeOfOrigin = placeOfOrigin;
        this.aliases = aliases;
        this.identity = identity;
    }

    // Getters y setters para todos los campos


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

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public String getAliases() {
        return aliases;
    }

    public void setAliases(String aliases) {
        this.aliases = aliases;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    // Método toString (opcional) para imprimir la información del personaje
    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", education='" + education + '\'' +
                ", placeOfOrigin='" + placeOfOrigin + '\'' +
                ", aliases='" + aliases + '\'' +
                ", identity='" + identity + '\'' +
                '}';
    }
}
