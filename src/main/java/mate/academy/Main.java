package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        // Create a new movie
        Movie movie = new Movie();
        movie.setTitle("Inception");
        movie.setDescription("A mind-bending thriller by Christopher Nolan.");

        // Add the movie to the database
        Movie savedMovie = movieService.add(movie);
        System.out.println("Movie added: " + savedMovie.getTitle());

        // Retrieve the movie by ID
        Movie retrievedMovie = movieService.get(savedMovie.getId());
        System.out.println("Retrieved movie: " + retrievedMovie.getTitle());
    }
}
