package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie alien4 = new Movie("Alien 4", "Fourth movie about Aliens");
        Movie predator3 = new Movie("Predator 3", "Third movie about Predators");
        movieService.add(alien4);
        movieService.add(predator3);
        System.out.println("Getting movie from DB " + movieService.get(alien4.getId()));
        System.out.println("Getting movie from DB " + movieService.get(predator3.getId()));
    }
}
