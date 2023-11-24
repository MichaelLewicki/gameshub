package cl.lewickidev.gameshub.domain.model;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

import java.time.LocalDate;

@RegisterForReflection
@Data
public class Game {

    private Long id;
    private String name;
    private LocalDate releaseDate;
    private String developer;
    private String publisher;
    private String genre;
    private String classification;

}
