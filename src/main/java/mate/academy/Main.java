package mate.academy;

import mate.academy.lib.Movie;
import mate.academy.lib.servicepackage.MovieService;
import mate.academy.lib.servicepackage.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        MovieService movieService = new MovieServiceImpl();
        movieService.add(movie);
        movieService.get(movie.getId());
    }
}
