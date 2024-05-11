package mate.academy;

import mate.academy.dao.DataProcessingException;
import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.model.Movie;

import java.util.Optional;

public class Main {
    private static final Injector injector =
            Injector.getInstance("mate.academy.service");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Terminator 5");
        movie.setDescription("Robot movie");

        movieService.add(movie);
        Movie movieFromDB = movieService.get(1L);
        System.out.println(movieFromDB);
    }
}
