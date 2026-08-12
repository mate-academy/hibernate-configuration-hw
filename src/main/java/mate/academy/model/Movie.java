package mate.academy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tittle;
    private String description;

    public Movie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Movie movie = (Movie) o;
        return Objects.equals(id, movie.id)
                && Objects.equals(tittle, movie.tittle)
                && Objects.equals(description, movie.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tittle, description);
    }

    @Override
    public String toString() {
        return "Movie{"
                + "id=" + id
                + ", tittle='" + tittle + '\''
                + ", description='" + description + '\''
                + '}';
    }
}
