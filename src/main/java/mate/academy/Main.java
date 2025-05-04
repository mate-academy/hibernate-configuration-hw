package mate.academy;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        MovieDao movieDao = new MovieDaoImpl();
        Movie movie = new Movie();
        movie.setTitle("Ababa");
        movie.setDescription("The Aguga rescuing the World.");
        movieDao.add(movie);
        Optional<Movie> movieFromDB = movieDao.get(1L);
        System.out.println(movieFromDB);
    }
}
