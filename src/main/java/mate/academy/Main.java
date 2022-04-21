package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Terminator-2");
        movie.setDescription("fantasy film");
        movieService.add(movie);
        Movie addedMovie = movieService.get(movie.getId());
        System.out.println(addedMovie);
    }
}
