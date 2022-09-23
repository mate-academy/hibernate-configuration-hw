package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = (Injector) Injector.getInstance("mate");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie taxi = new Movie();
        taxi.setTitle("Taxi");
        taxi.setDescription("Very speed movie");

        movieService.add(taxi);

        Movie movie = movieService.get(1L);
        System.out.println(movie);
    }
}
