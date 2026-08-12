package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie("Matrix", "Sci-fi action");
        Movie saved = movieService.add(movie);
        System.out.println(saved);

        Movie fetched = movieService.get(saved.getId());
        System.out.println(fetched);
    }
}
