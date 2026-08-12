package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie fastAndFurious = new Movie();
        fastAndFurious.setTitle("Fast and Furious");
        fastAndFurious.setDescription("Movie about fast cars");

        System.out.println("Adding new movie...");
        Movie addedMovie = movieService.add(fastAndFurious);
        System.out.println("Added: " + addedMovie);

        Long movieId = addedMovie.getId();
        System.out.println("\nGetting movie by ID " + movieId + "...");
        Movie retrievedMovie = movieService.get(movieId);
        System.out.println("Retrieved: " + retrievedMovie);

    }
}
