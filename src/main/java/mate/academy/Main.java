package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy.dao");

    public static void main(String[] args) {
        MovieDao movieDao = (MovieDao) INJECTOR.getInstance(MovieDao.class);
        MovieService movieService = new MovieServiceImpl(movieDao);
        Movie movie = new Movie(1L, "Saw 5", "Interesting horror");
        movieService.add(movie);
        System.out.println(movieService.get(1L));
    }
}
