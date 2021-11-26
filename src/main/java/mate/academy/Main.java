package mate.academy;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.model.Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setId(10L);
        movie.setTitle("Terminator 555");
        movie.setDescription("Awesome movie");
        MovieDao movieDao = new MovieDaoImpl();
        movieDao.save(movie);
        Optional<Movie> movieFromDB = movieDao.get(1L);
        System.out.println(movieFromDB);

    }
}
