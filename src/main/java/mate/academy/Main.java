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
        Movie movie = new Movie();
        movie.setTitle("testHibernate2");
        movie.setDescription("DescriptionTest2");

        movieService.add(movie);
        System.out.println(movieService.get(1L));
    }
}
