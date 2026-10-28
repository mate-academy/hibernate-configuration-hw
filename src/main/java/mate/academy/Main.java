package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie("Verity", "Movie about book author and her scary secrets.");
        movieService.add(movie);
        System.out.println("Added movie: " + movie);

        Movie fetchedMovie = movieService.get(movie.getId());
        System.out.println("Fetched movie from DB: " + fetchedMovie);

    }
}
