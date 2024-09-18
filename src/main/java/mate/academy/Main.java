package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie terminator = new Movie();
        terminator.setTitle("Terminator");
        terminator.setDescription("Sci-fi");
        MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);
        MovieService movieService = new MovieServiceImpl(movieDao);
        movieService.add(terminator);
        movieService.get(1L);
    }
}
