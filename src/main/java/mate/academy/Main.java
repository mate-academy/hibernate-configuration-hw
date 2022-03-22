package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie("The Lord of the Rings: The Fellowship of the Ring",
                "Epic fantasy adventure film directed by Peter Jackson, based on the 1954 novel");
        System.out.println(movieService.add(movie));
        System.out.println(movieService.get(movie.getId()));
    }
}
