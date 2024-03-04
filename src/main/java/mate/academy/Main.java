package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    // wos private
    public static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Terminator 2");
        movie.setDescription("Terminator 2 description");

        movieService.add(movie);
        System.out.println(movie);

        Movie movieFromDb = movieService.get(1L);
        System.out.println(movieFromDb);
    }
}
