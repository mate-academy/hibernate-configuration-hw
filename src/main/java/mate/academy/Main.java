package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        final Injector injector = Injector.getInstance("mate.academy");
        final MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie("Harry Potter and the Philosopher's Stone", "Fantasy");
        movieService.add(movie);
        System.out.println(movieService.get(1L));
    }
}
