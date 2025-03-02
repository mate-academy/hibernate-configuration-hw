package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Inception");
        movie.setDescription("Good film");

        Movie savedMovie = movieService.add(movie);

        Movie retrievedMovie = movieService.get(savedMovie.getId());
        System.out.println(retrievedMovie);
    }
}
