package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {

        Injector injector = Injector.getInstance("mate.academy"); // Replace with your package name
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        // Test the add method
        Movie movie = new Movie();
        movie.setTitle("Inception");
        movie.setDescription("A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a CEO.");
        movieService.add(movie);

        // Test the get method
        Movie retrievedMovie = movieService.get(movie.getId());
        System.out.println(retrievedMovie.getTitle() + " - " + retrievedMovie.getDescription());
    }
}
