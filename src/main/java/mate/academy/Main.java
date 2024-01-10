package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector
            .getInstance("mate.academy");

    public static void main(String[] args) {
        Movie duneMovie = new Movie("Dune", "sci-fy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(duneMovie);
        Movie anotherDuneMovie = movieService.get(1L);
        System.out.println(anotherDuneMovie);
    }
}
