package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movieWest = new Movie();
        movieWest.setTitle("West");
        movieService.add(movieWest);

        System.out.println(movieService.get(1L));
    }
}
