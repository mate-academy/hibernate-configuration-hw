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
        movie.setDescription("A mind-bending thriller");
        Movie savedMovie = movieService.add(movie);
        System.out.println("Saved movie: " + savedMovie);
        Movie fetchedMovie = movieService.get(savedMovie.getId());
        System.out.println("Fetched movie: " + fetchedMovie);
    }
}
