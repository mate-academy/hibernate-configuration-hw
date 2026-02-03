package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.services.MovieService;

public class Main {

    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie(null, "First movie", "It's first movie");
        movieService.add(movie);

        System.out.println(movieService.get(movie.getId()).getTitle());
    }
}
