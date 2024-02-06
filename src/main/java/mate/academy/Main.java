package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie terminatorFive = new Movie();
        terminatorFive.setTitle("Terminator Five");
        terminatorFive.setDescription("Awesome movie");
        Movie add = movieService.add(terminatorFive);
        Movie movie = movieService.get(1L);
    }
}
