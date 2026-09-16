package mate.academy;

import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        MovieService movieService = new MovieServiceImpl();
        Movie movie = new Movie();
        movie.setTitle("Big trouble in little China");
        movieService.add(movie);

        Movie movieFromDb = movieService.get(1L);
        System.out.println(movieFromDb);
    }
}
