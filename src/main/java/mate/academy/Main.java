package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Harry Potter and Philosopher's Stone");

        movieService.add(movie);
        movieService.get(1L);
        // test all methods from MovieService
        // use anotations
        // run tests with command mvn -DskipTests=false clean package

    }
}
