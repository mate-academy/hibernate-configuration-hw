package mate.academy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigInteger;

@javax.persistence.Entity
public class Movie {
    public void setId(BigInteger id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    private String title;
    private String description;

    public Movie(BigInteger id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

        public Movie() {
        }

    public void setTitle(String mymoive) {
    }
}
