package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie itMovie = new Movie();
        itMovie.setTitle("It");
        Movie scaryMovie = new Movie();
        scaryMovie.setTitle("scary movie");
        movieService.add(itMovie);
        movieService.add(scaryMovie);
        movieService.get(itMovie.getId());
        movieService.get(scaryMovie.getId());
    }
}
