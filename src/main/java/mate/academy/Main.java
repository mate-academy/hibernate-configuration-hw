package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);
        Movie someMovie = new Movie("new movie", "some description");
        movieService.add(someMovie);
        Movie movie = movieService.get(someMovie.getId());
        System.out.println(movie);
    }
}
