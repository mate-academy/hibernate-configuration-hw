package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setId(10L);
        movie.setTitle("Fast and Furious 9");
        movie.setDescription("Awesome movie");
        MovieDao movieDao = new MovieDaoImpl();
        movieDao.save(movie);
        MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);
        Movie movieFromDB = movieService.get(1L);
        System.out.println(movieFromDB);
    }
}
