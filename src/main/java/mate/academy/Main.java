package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Movie firstMovie = new Movie("Terminator 2", "Science Fiction");
        Movie secondMovie = new Movie("Lord of the Rings", "Fantasy");

        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(firstMovie);
        movieService.add(secondMovie);

        Movie fromDb = movieService.get(1L);
        System.out.println(fromDb);
    }
}
