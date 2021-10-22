package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        movieService.add(new Movie("STAR WARS", "Episode I"));
        movieService.add(new Movie("STAR WARS", "Episode II"));
        Movie movie1 = movieService.get(1L);
        Movie movie2 = movieService.get(2L);
        System.out.println(movie1);
        System.out.println(movie2);
    }
}
