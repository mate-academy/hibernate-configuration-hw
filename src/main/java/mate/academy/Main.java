package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Longlegs");

        movieService.add(movie);
        Movie movieById = movieService.get(1L);

        System.out.println(movieById);
    }
}
