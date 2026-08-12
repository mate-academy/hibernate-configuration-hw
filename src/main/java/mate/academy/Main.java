package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.servises.MovieService;

public class Main {
    private static final Injector injector =
            Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Harry Potter and the Deathly Hallows");
        movie.setDescription("It is a fantasy novel written by British author J. K. "
                + "Rowling and the seventh and final novel in the Harry Potter series");
        movieService.add(movie);
    }
}
