package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    private static final Injector injector = Injector
            .getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = new MovieServiceImpl();
        Movie movie = new Movie();
        movie.setTitle("Fast and Furious 9");
        movie.setDescription("Fast and Furious 9");
        movieService.add(movie);
    }
}
