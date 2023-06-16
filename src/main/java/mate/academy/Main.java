package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService)INJECTOR.getInstance(MovieService.class);
        Movie movie = new Movie("Shrek","Nice");
        System.out.println(movieService.add(movie));
        System.out.println(movieService.get(1L));

    }
}
