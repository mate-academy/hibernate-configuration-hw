package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService
            = (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie spiderMan = new Movie();
        Movie harryPotter = new Movie();
        spiderMan.setTitle("Spider-man 2");
        spiderMan.setDescription("movie about super hero");
        harryPotter.setTitle("Harry Potter");
        harryPotter.setDescription("movie for kids");
        movieService.add(spiderMan);
        movieService.add(harryPotter);
        System.out.println(movieService.get(harryPotter.getId()));
        System.out.println(movieService.get(spiderMan.getId()));
    }
}
