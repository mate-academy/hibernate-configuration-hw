package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static MovieService movieService = (MovieService) injector
            .getInstance(MovieService.class);

    public static void main(String[] args) {

        MovieDao movieDao = new MovieDaoImpl();
        Movie movie = new Movie();
        movie.setId(10L);
        movie.setTitle("Terminator 5");
        movie.setDescription("awesome movie");

        Movie addToDB = movieService.add(movie);
        Movie movieFromDB = movieService.get(1L);
        System.out.println(movieFromDB);
    }
}
