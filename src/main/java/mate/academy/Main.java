package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.models.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie("Great movie", "Awesome movie");
        movie = movieService.add(movie);
        Movie movieFromDB = movieService.get(movie.getId());
        System.out.println(movieFromDB);
    }
}
