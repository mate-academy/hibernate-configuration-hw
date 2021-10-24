package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Application {
    public static final Injector injector = Injector.getInstance("mate.academy");

    public static void runTest() {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Harry Potter");
        movie.setDescription("Awesome movie");
        Movie movieAdd = movieService.add(movie);
        Movie movieByGet = movieService.get(1L);
        System.out.println(movieAdd);
        System.out.println(movieByGet);
    }
}
