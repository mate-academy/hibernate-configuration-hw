package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.services.MovieService;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie terminator = new Movie();
        terminator.setTitle("Terminator");
        terminator.setDescription("Awesome movie");
        terminator.setId(1L);
        MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);
        movieService.add(terminator);
        movieService.get(terminator.getId());
    }
}
