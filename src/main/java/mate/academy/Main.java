package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final String INJECTOR_INSTANCE = "mate.academy";
    private static final Injector injector = Injector.getInstance(INJECTOR_INSTANCE);

    public static void main(String[] args) {

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Leon");
        movie.setDescription("The best killer movie");
        movieService.add(movie);
        Movie movieFromDB = movieService.get(1L);
        System.out.println(movieFromDB);
    }
}
