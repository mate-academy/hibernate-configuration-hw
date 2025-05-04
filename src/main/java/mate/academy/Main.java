package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("World War II");
        movie.setDescription("Some Description");
        Movie savedMovie = movieService.add(movie);
        System.out.println("Saved movie: " + savedMovie);

        Movie movieFromDb = movieService.get(savedMovie.getId());
        System.out.println("Get saved movie: " + movieFromDb);
    }
}
