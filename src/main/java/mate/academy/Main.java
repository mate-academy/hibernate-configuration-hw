package mate.academy;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.model.Movie;

public class Main {
    public static void main(String[] args) {
        MovieDao movieDao = new MovieDaoImpl();
        Movie movie = new Movie();
        movie.setTitle("Terminator 5");
        movie.setDescription("awesome movie");
        movieDao.add(movie);
        Optional<Movie> movieFromDB = movieDao.get(1L);
        System.out.println(movieFromDB);
    }
}
