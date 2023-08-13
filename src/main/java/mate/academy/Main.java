package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.services.MovieService;

public class Main {
    private static final Injector INJECTOR =
            Injector.getInstance("mate.academy");
    private static MovieService movieService =
            (MovieService) INJECTOR.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("In a desert");
        movie.setDescription("Funny no water life");

        Movie result = movieService.add(movie);
        System.out.println(result);
        Movie movieFromDB = movieService.get(1L);
        System.out.println(movieFromDB);
    }
}
