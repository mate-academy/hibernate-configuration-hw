package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        // Test add
        System.out.println("=== Testing add method ===");
        Movie movie1 = new Movie("The Shawshank Redemption",
                "Two imprisoned men bond over a number of years");
        Movie movie2 = new Movie("The Godfather",
                "The aging patriarch of an organized crime dynasty");
        Movie movie3 = new Movie("The Dark Knight",
                "Batman faces the Joker");

        Movie savedMovie1 = movieService.add(movie1);
        Movie savedMovie2 = movieService.add(movie2);
        Movie savedMovie3 = movieService.add(movie3);

        System.out.println("Saved: " + savedMovie1);
        System.out.println("Saved: " + savedMovie2);
        System.out.println("Saved: " + savedMovie3);

        // Test get
        System.out.println("\n=== Testing get method ===");
        Movie retrievedMovie = movieService.get(savedMovie1.getId());
        System.out.println("Retrieved movie: " + retrievedMovie);

        retrievedMovie = movieService.get(savedMovie2.getId());
        System.out.println("Retrieved movie: " + retrievedMovie);

        retrievedMovie = movieService.get(savedMovie3.getId());
        System.out.println("Retrieved movie: " + retrievedMovie);

        // Test getting non-existent movie
        System.out.println("\n=== Testing get non-existent movie ===");
        try {
            movieService.get(999L);
        } catch (RuntimeException e) {
            System.out.println("Expected exception: " + e.getMessage());
        }
    }
}
