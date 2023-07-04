package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        final MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Topgun999");
        movie.setDescription("aviators");
        movieService.add(movie);

        Movie movieReturned = movieService.get(1L);
        System.out.println(movie);
    }
}
