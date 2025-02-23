package mate.academy;

import mate.academy.entity.Movie;
import mate.academy.lib.Injector;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie("Harry Potter", "Awesome movie");
        Movie retrievedMovie = movieService.get(1L);
    }
}
