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
        movie.setTitle("The Tomorrow War");
        movie.setDescription("A family man is drafted to fight in a future war where the fate"
                + " of humanity relies on his ability to confront the past.");
        movieService.add(movie);
        Movie movieFromDB = movieService.get(1L);
        System.out.println(movieFromDB);
    }
}
