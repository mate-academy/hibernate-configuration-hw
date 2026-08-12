package mate.academy;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.model.Movie;

public class Main {
    public static void main(String[] args) {
        MovieDao movieDao = new MovieDaoImpl();
        Movie movie = new Movie();
        movie.setTitle("Fast and Furious 9");
        movie.setDescription("Action 2020");
        movieDao.add(movie);

        Optional<Movie> movieFromDb = movieDao.get(1L);
        System.out.println(movieFromDb);
    }
}
