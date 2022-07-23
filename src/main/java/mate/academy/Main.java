package mate.academy;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate");
    private static MovieService movieService
            = (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Terminator");
        movie.setDescription("Awesome oldschool movie");

        Movie movie2 = new Movie();
        movie2.setTitle("I robot");
        movie2.setDescription("Awesome always actual movie");

        movieService.add(movie);
        movieService.add(movie2);

        MovieDao movieDao = new MovieDaoImpl();
        Optional<Movie> movie1FromDB = movieDao.get(1L);
        Optional<Movie> movie2FromDB = movieDao.get(2L);

        System.out.println(movie1FromDB.get());
        System.out.println(movie2FromDB.get());
    }
}
