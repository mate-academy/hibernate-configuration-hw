package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    public static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieServiceImpl) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("new movie");
        movie.setDescription("good movie");
        movieService.add(movie);
    }
}
