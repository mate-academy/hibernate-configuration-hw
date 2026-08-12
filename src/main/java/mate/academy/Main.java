package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Terminator");
        movie.setDescription("Film with Armold Schwartsneger");
        Movie added = movieService.add(movie);
        System.out.println(added + " was added!");

        System.out.println(movieService.get(1L) + " is get from DB");
    }
}
