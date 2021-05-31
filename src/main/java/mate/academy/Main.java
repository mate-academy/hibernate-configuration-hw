package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static MovieService movieService
            = (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        MovieDao movieDao = new MovieDaoImpl();
        Movie movie = new Movie();
        movie.setTitle("Film");
        movie.setDescription("Film description");
        movieDao.add(movie);

        Movie movieFromDb = movieDao.get(1L);
        System.out.println(movieFromDb);
    }
}
