package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie newMovie = new Movie();
        newMovie.setDescription("test");
        newMovie.setTitle("Test");
        newMovie = movieService.add(newMovie);
        newMovie = movieService.get(newMovie.getId());
        System.out.println(newMovie);
    }
}
