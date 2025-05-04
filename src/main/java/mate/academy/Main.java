package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        System.out.println(movieService);

        Movie movie = new Movie();
        movie.setTitle("Californication");
        movie.setDescription("Is the best");

        movieService.add(movie);
        Movie fetchedMovie = movieService.get(movie.getId());
        System.out.println("Fetched movie: " + fetchedMovie.getTitle());
    }
}
