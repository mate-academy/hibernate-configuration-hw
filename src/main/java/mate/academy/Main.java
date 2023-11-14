package mate.academy;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");
    private static MovieDao movieDao;

    public static void main(String[] args) {
        MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);
        Movie movie = new Movie();
        movieDao = new MovieDaoImpl();
        movie.setId(10L);
        movie.setTitle("Fast and Furious 9");
        movie.setDescription("Awesome movie");
        movieDao.save(movie);
        Optional<Movie> movieFromDB = movieDao.get(1L);
        System.out.println(movieFromDB);
    }
}
