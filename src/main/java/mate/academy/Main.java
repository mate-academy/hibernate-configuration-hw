package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        MovieService movieService = (MovieService) Injector.getInstance(
                String.valueOf(MovieService.class));
        Movie movie = new Movie();
        movie.setTitle("movie");

        movieService.add(movie);
        movieService.get(1L);
    }
}
