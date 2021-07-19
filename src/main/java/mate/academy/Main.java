package mate.academy;

import mate.academy.lib.Inject;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    @Inject
    private static MovieService movieService;

    public static void main(String[] args) {
        movieService.add(new Movie());
    }
}
