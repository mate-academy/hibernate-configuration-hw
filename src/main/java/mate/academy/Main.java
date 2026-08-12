package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie firstMovie = new Movie(
                1L, "Inception", "It will make your brain work!");
        movieService.add(firstMovie);
        Movie secondMovie = new Movie(
                2L, "Fast and Furious 10", "Recommend you to save few hours of your life)");
        movieService.add(secondMovie);
        System.out.println(movieService.get(2L));

    }
}
