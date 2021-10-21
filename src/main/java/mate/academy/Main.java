package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.model.Movie;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        MovieDao movieDao = new MovieDaoImpl();

        Movie movie = new Movie();
        movie.setId(10L);
        movie.setTitle("Terminator 5");
        movie.setDescription("Awesome movie");

        movieDao.save(movie);

        Optional<Movie> movieFromDB = movieDao.get(1L);
        System.out.println(movieFromDB);

    }
}
