package mate.academy.dao.impl;

import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MovieDaoImplTest {
    private MovieDaoImpl movieDao;

    @BeforeEach
    public void setUp() {
        HibernateUtil.initSessionFactory("hibernate-test.cfg.xml");
        movieDao = new MovieDaoImpl();
    }

    @Test
    void addMovie_ok() {
        Movie movie = buildMovie();
        movieDao.add(movie);
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Movie foundMovie = session.get(Movie.class, movie.getId());
            assertEquals(movie.getTitle(), foundMovie.getTitle());
        }
    }

    @Test
    void getMovie_ok() {
        Movie movie = buildMovie();
        movieDao.add(movie);
        Optional<Movie> foundMovie = movieDao.get(movie.getId());
        assertTrue(foundMovie.isPresent());
        assertEquals(movie.getTitle(), foundMovie.get().getTitle());
    }

    @Test
    void getMovie_notFound() {
        Long id = 1L;
        Optional<Movie> foundMovie = movieDao.get(id);
        assertTrue(foundMovie.isEmpty());
    }

    private static Movie buildMovie() {
        return new Movie.Builder().setTitle("Title").setDescription("Description").build();
    }
}
