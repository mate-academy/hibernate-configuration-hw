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
        movie.setTitle("Fast and Furious 9");
        movie.setDescription("Awesome movie");
        movieService.add(movie);
        Movie movieFromDb = movieService.get(1L);
        System.out.println(movieFromDb);
    }
}
