package mate.academy;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieDao movieDao = new MovieDaoImpl();

        Movie movie = new Movie();
        movie.setTitle("lord of the ring");
        movie.setDescription("favorite movie");

        movieDao.add(movie);

        Optional<Movie> movie1 = movieDao.get(1L);
        System.out.println(movie1);
    }
}
