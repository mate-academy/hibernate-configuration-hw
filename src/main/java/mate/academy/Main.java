package mate.academy;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.dao.impl.MovieDaoImpl;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieDao movieDao = new MovieDaoImpl();
        MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie("Titanic", "Drama");
        movieService.add(movie);
        Optional<Movie> movieFromDB = movieDao.get(1L);
        System.out.println(movieFromDB);
        System.out.println(movieService.get(movie.getId()));
    }
}
