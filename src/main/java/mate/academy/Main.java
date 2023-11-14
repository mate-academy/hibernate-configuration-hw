package mate.academy;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
        private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);
        MovieDao movieDao = new MovieDaoImpl();
        Movie movie = new Movie();
        movie.setId(10L);
        movie.setTitle("Fast and Furious 9");
        movie.setDescription("Awesome movie");
        movieDao.save(movie);
        Optional<Movie> movieFromDB = movieDao.get(1L);
    }
}
