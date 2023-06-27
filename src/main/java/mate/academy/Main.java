package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie watchmenMovie = new Movie();

        watchmenMovie.setTitle("Watchmen");
        watchmenMovie.setDescription("In 1985 where former superheroes exist, the murder of a "
                + "colleague sends active vigilante Rorschach into his own sprawling "
                + "investigation, uncovering something that could completely change the "
                + "course of history as we know it.");

        System.out.println(movieService.add(watchmenMovie));
        System.out.println(movieService.get(watchmenMovie.getId()));
    }
}
