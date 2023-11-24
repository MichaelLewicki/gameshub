package cl.lewickidev.gameshub.infrastructure.adapter.output.mysql.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
public class GameEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GAME_ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "RELEASE_DATE", nullable = false)
    private LocalDate releaseDate;

    @Column(name = "DEVELOPER", nullable = false)
    private String developer;

    @Column(name = "PUBLISHER", nullable = false)
    private String publisher;

    @Column(name = "GENRE", nullable = false)
    private String genre;

    @Column(name = "CLASSIFICATION", nullable = false)
    private String classification;

    //private List<String> plataforms;


    public GameEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "GameEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", releaseDate=" + releaseDate +
                ", developer='" + developer + '\'' +
                ", publisher='" + publisher + '\'' +
                ", genre='" + genre + '\'' +
                ", classification='" + classification + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GameEntity that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getReleaseDate(), that.getReleaseDate()) && Objects.equals(getDeveloper(), that.getDeveloper()) && Objects.equals(getPublisher(), that.getPublisher()) && Objects.equals(getGenre(), that.getGenre()) && Objects.equals(getClassification(), that.getClassification());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getReleaseDate(), getDeveloper(), getPublisher(), getGenre(), getClassification());
    }
}
