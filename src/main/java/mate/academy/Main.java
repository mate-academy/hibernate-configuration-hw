package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie1 = new Movie("Black Butler", "shonen");
        long movieId1 = movieService.add(movie1).getId();

        System.out.println(movieService.get(movieId1));

        Movie movie2 = new Movie("Sasaki to Miyano", "shonen-ai");
        long movieId2 = movieService.add(movie2).getId();

        System.out.println(movieService.get(movieId2));
    }
}
