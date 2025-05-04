package mate.academy;

import mate.academy.lib.model.Movie;
import mate.academy.lib.service.MovieService;
import mate.academy.lib.service.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        MovieService movieService = new MovieServiceImpl();
        movieService.add(movie);
        movieService.get(movie.getId());
    }
}
