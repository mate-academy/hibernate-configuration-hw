package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieServiceImpl.class);
        Movie movie = new Movie();
        movie.setDescription("Fanny video");
        movie.setTitle("Terminator");
        movieService.add(movie);
        System.out.println(movieService.get(movie.getId()));
    }
}
