package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService service = (MovieService) injector.getInstance(MovieService.class);

        Movie firstMovie = new Movie();
        firstMovie.setTitle("United 93");
        firstMovie.setDescription("A real-time account of the events on United Flight 93.");

        service.add(firstMovie);
        service.get(firstMovie.getId());
    }
}
