package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector =
            Injector.getInstance("mate");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Pirates");
        movie.setDescription("5 stars movie");
        movieService.add(movie);
        Movie movieFromDb = movieService.get(1L);
        System.out.println(movieFromDb);

    }
}
