package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie scaryMovie = new Movie();
        scaryMovie.setTitle("Scary Movie2");
        scaryMovie.setDescription("Another scary movie");
        movieService.add(scaryMovie);
        System.out.println(movieService.get(1L));
    }
}
