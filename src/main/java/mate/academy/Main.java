package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {

        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie(1L, "Harry Potter and the Order of the Phoenix",
                "Harry joins the Order of the Phoenix");

        movieService.add(movie);
        movieService.get(1L);

    }
}
