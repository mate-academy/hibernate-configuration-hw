package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector
            .getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Fast and Furious");
        movie.setDescription("Action movie about racing");

        movieService.add(movie);
        System.out.println("Added movie: " + movie);

        Long movieId = movie.getId();
        Movie retrievedMovie = movieService.get(movieId);
        System.out.println("Retrieved movie: " + retrievedMovie);

    }
}
