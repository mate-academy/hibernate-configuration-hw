package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie darkKnight = new Movie();
        darkKnight.setTitle("Dark Knight");
        darkKnight.setDescripion("Movie about Batman");

        Movie flash = new Movie();
        flash.setTitle("Flash");
        flash.setDescripion("Movie about Flash");

        movieService.add(darkKnight);
        movieService.add(flash);
        System.out.println(movieService.get(darkKnight.getId()));
        System.out.println(movieService.get(flash.getId()));
    }
}
