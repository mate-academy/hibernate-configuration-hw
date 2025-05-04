package mate.academy;

import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.util.Injector;

public class Main {
    private static final Injector injector
            = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService
                = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Tetris");
        movie.setDescription("A game that you can't stop playing. "
                + "A story that can't be imagined");
        movieService.add(movie);
        movieService.get(movie.getId());
    }
}
