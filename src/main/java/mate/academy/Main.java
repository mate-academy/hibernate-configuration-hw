package mate.academy;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;

public class Main {
    public static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        final MovieDao movieService =
                (MovieDao) injector.getInstance(MovieDao.class);
        Movie movie = new Movie();
        movie.setId(10L);
        movie.setTitle("Terminator 85");
        movie.setDescription("awesome movie");

        movieService.add(movie);
        Optional<Movie> movieFromDB = movieService.get(1L);
        System.out.println(movieFromDB);
    }
}
