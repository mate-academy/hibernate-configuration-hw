package mate.academy;

import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Breaking Bad");
        movie.setDescription("Walter White");
        MovieService movieService = new MovieServiceImpl();
        movieService.add(movie);
        movieService.get(movie.getId());
    }
}
