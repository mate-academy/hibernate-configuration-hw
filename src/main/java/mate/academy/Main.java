package mate.academy;

import mate.academy.dao.MovieService;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;

public class Main {
    private static Injector injector = Injector.getInstance("mate");
    private static MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie("Spotlight", "Incredible");
        System.out.println("add" + movieService.add(movie));
        System.out.println("get" + movieService.get(movie.getId()));
    }
}
