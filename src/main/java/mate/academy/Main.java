package mate.academy;

import mate.academy.exception.DataProcessingException;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.impl.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        MovieService movieService = new MovieServiceImpl();
        Movie movieToAdd = new Movie();

        movieToAdd.setTitle("The Ice");
        movieToAdd.setDescription("Good book.");

        try {
            Movie addedMovie = movieService.add(movieToAdd);
            System.out.println("Added Movie: " + addedMovie.getTitle());
        } catch (DataProcessingException e) {
            System.err.println("Error adding movie");
        }

        try {
            Long movieId = 1L;
            Movie movie = movieService.get(movieId);
            System.out.println("Retrieved Movie: " + movie.getTitle());
        } catch (DataProcessingException e) {
            System.err.println("Error fetching movie");
        }
    }
}
