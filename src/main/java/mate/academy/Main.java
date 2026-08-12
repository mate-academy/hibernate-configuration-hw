package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService = (MovieService)
            injector.getInstance(MovieService.class);

    public static void main(String[] args) {

        Movie firstMovie = movieService
                .add(new Movie("Stars wars", "Piu piu piu"));
        Movie secondMovie = movieService
                .add(new Movie("Shrek", "Big green guy"));
        System.out.println(movieService.get(firstMovie.getId()).toString()
                + movieService.get(secondMovie.getId()).toString());
    }
}
