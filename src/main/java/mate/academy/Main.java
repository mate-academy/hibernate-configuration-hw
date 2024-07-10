package mate.academy;

import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        final MovieService movieService = new MovieServiceImpl();

        Movie movie = new Movie();
        movie.setTitle("The Hitchhiker's Guide to the Galaxy");
        movie.setDescription("Knowing where one's towel is.");

        movieService.add(movie);
        Movie movieFromDB = movieService.get(1L);
        System.out.println(movieFromDB);
    }
}
