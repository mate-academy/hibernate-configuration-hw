package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie("Lord Of The Rings", "Best of the Best Thing number ONE!");
        movieService.add(movie);
        System.out.println(movieService.get(movie.getId()));
    }
}
