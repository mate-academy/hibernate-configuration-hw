package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {

    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie addedMovie = movieService.add(new Movie());
        Movie movie = movieService.get(addedMovie.getId());
        System.out.println(addedMovie);
        System.out.println(movie);
    }
}
