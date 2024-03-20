package mate.academy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigInteger;

@jakarta.persistence.Entity
public class Movie {
    @jakarta.persistence.Id
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
