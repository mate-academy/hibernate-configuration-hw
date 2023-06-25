package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie film = new Movie();
        film.setTitle("Film");
        film.setDescription("Description to film.");
        movieService.add(film);
        System.out.println(movieService.get(1L));
    }
}
