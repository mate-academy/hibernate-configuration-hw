package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {

    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        try {
            Movie movie = new Movie("Movie Title", "Movie Description");
            movieService.add(movie);
            System.out.println("Movie added: " + movie);

            long movieId = movie.getId();
            Movie retrievedMovie = movieService.get(movieId);
            System.out.println("Retrieved movie: " + retrievedMovie);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
