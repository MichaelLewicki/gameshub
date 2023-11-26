package cl.lewickidev.gameshub.infrastructure.adapter.output.mysql.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Entity
@Data
@RegisterForReflection
public class GameEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GAME_ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "RELEASE_DATE", nullable = false)
    private Date releaseDate;

    @Column(name = "DEVELOPER", nullable = false)
    private String developer;

    @Column(name = "PUBLISHER", nullable = false)
    private String publisher;

    @Column(name = "GENRE", nullable = false)
    private String genre;

    @Column(name = "CLASSIFICATION", nullable = false)
    private String classification;

    //private List<String> plataforms;

}
