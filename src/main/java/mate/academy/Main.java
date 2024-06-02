package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.sevice.MovieService;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);
        Movie movie = new Movie("Book of Jungles", "This is a book about jungles");
        movieService.add(movie);

        Movie movieById = movieService.get(1L);
        System.out.println(movieById);
    }
}
