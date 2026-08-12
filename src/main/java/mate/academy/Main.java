package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate");
    private static MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Inventing Anna");
        movie.setDescription("Nice series");
        movieService.add(movie);
        Movie movie1 = movieService.get(1L);
        System.out.println(movie1.getDescription());
    }
}
