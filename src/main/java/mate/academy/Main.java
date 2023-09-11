package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector INJECTOR_MAP = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) INJECTOR_MAP.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Test");
        movie.setDescription("Test description");

        movieService.add(movie);

        System.out.println(movieService.get(1L));
    }
}
