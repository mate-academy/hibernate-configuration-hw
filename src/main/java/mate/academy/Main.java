package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.services.movieservice.MovieService;
import mate.academy.services.movieservice.MovieServiceImpl;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy.dao");

    public static void main(String[] args) throws DataProcessingException {
        MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);

        MovieService movieService = new MovieServiceImpl(movieDao);

        Movie movie = new Movie();
        movie.setTitle("Bullet train");
        movie.setDescription("Comedy/action/thriller");

        movieService.add(movie);
        System.out.println(movieService.get(1L));
    }
}
