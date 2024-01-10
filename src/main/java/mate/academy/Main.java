package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector
            .getInstance("mate.academy");

    public static void main(String[] args) {
        Movie ghostsInVeniceMovie = new Movie("Ghosts in Venice", "detective");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(ghostsInVeniceMovie);
        Movie anotherGhostsInVeniceMovie = movieService.get(1L);
        System.out.println(anotherGhostsInVeniceMovie);
    }
}
