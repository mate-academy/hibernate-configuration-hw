package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie1 = new Movie("The Shawshank Redemption",
                "Two imprisoned men bond over a number of years");
        Movie savedMovie1 = movieService.add(movie1);
        System.out.println("Added movie: " + savedMovie1);

        Movie movie2 = new Movie("The Godfather",
                "The aging patriarch of an organized crime dynasty");
        Movie savedMovie2 = movieService.add(movie2);
        System.out.println("Added movie: " + savedMovie2);

        Movie retrievedMovie1 = movieService.get(savedMovie1.getId());
        System.out.println("Retrieved movie: " + retrievedMovie1);

        Movie retrievedMovie2 = movieService.get(savedMovie2.getId());
        System.out.println("Retrieved movie: " + retrievedMovie2);
    }
}
