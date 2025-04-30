package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie newMovie = new Movie();
        newMovie.setTitle("New film");
        movieService.add(newMovie);
        System.out.println(movieService.get(1L));
    }
}
