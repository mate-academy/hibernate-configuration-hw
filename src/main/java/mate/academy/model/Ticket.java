package mate.academy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany
    @JoinColumn(name = "movie_session_id")
    private MovieSession movieSession;
    @ManyToMany
    @JoinColumn(name = "user_id")
    private User user;

    public Long getId() {
        return id;
    }

    public Ticket setId(Long id) {
        this.id = id;
        return this;
    }

    public MovieSession getMovieSession() {
        return movieSession;
    }

    public Ticket setMovieSession(MovieSession movieSession) {
        this.movieSession = movieSession;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Ticket setUser(User user) {
        this.user = user;
        return this;
    }
}
