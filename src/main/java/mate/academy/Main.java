package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);
        Movie movie = new Movie("The Shawshank Redemption",
                "Top 1 IMDB movie");
        Movie addedMovie = movieService.add(movie);
        Movie receivedMovie = movieService.get(movie.getId());

        System.out.println("Created movie: " + movie);
        System.out.println("Added movie in DB: " + addedMovie);
        System.out.println("Received movie from DB: " + receivedMovie);
    }
}
