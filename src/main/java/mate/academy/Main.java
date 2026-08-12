package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Terminator 4");
        movie.setDescription("Awesome movie");

        Movie addedMovie = movieService.add(movie);

        Movie movieFromDb = movieService.get(addedMovie.getId());
        System.out.println("Movie from DB: " + movieFromDb);
    }
}
