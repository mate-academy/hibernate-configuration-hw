package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector serviceInjector = Injector.getInstance("mate.academy.service");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) serviceInjector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Matrix");
        movie.setDescription("Good movie");
        movieService.add(movie);
        System.out.println(movieService.get(1L));
    }
}
