package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);

        Movie movie1 = new Movie();
        movie1.setTitle("Terminator 1");
        movie1.setDescription("Good movie");

        movieDao.add(movie1);
        movieDao.get(1L);

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie2 = new Movie();
        movie1.setTitle("Terminator 2");
        movie1.setDescription("Also good movie");

        movieService.add(movie2);
        movieService.get(2L);
    }
}
