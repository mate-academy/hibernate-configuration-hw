package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.impl.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movieOne = new Movie("Rick and Morty", "film");
        movieService.add(movieOne);
        System.out.println(movieService.get(1l));

    }
}
