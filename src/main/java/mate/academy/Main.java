package mate.academy;

import java.util.zip.DataFormatException;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) throws DataFormatException {
        Movie movie = new Movie("Avatar", "Super description");
        movieService.add(movie);
        Movie movieFromDb = movieService.get(1L);
        System.out.println(movieFromDb);
    }
}
