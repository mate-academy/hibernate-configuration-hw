package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static final Injector injector = Injector.getInstance("mate.academy");
    public static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie humanAnger = new Movie();
        humanAnger.setTitle("Human anger");
        humanAnger.setDescription("action");

        Movie saw = new Movie();
        saw.setTitle("Saw: Spiral");
        saw.setDescription("horror");

        movieService.add(humanAnger);
        movieService.add(saw);

        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
    }
}
