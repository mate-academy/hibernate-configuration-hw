package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("The Godfather");
        movie.setDescription("Crime drama film");

        Movie addedMovie = movieService.add(movie);
        System.out.println("Added movie ID: " + addedMovie.getId());

        Movie retrievedMovie = movieService.get(addedMovie.getId());
        System.out.println("Retrieved movie: " + retrievedMovie.getTitle());
    }
}

