package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Call");
        movie.setDescription("Awesome movie");
        Movie movieTerminator = new Movie();
        movieTerminator.setTitle("Terminator");
        movieTerminator.setDescription("adventure movie, fantastic");
        movieService.add(movie);
        movieService.add(movieTerminator);
        System.out.println(movieService.get(2L));
    }
}
