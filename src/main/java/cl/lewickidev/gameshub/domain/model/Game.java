package cl.lewickidev.gameshub.domain.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

import java.util.Date;

@RegisterForReflection
@Data
public class Game {

    private Long id;
    private String name;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date releaseDate;
    private String developer;
    private String publisher;
    private String genre;
    private String classification;

}
