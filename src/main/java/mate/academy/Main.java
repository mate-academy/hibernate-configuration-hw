package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService = (MovieService) injector
            .getInstance(MovieService.class);
    public static void main(String[] args) {
        Movie avengers = new Movie();
        avengers.setTitle("Avengers");
        avengers.setDescription("Another Marvel movie");
        Movie ironMan = new Movie();
        ironMan.setTitle("Iron Man");
        ironMan.setDescription("And another Marvel movie");
        movieService.add(avengers);
        movieService.add(ironMan);
        movieService.get(1L);
        movieService.get(2L);
    }
}
