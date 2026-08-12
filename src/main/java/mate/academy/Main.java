package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);
        Movie movie = new Movie("Harry Potter", "Family movie");
        Movie movieAdd = movieService.add(movie);
        Movie movieGet = movieService.get(1L);
        System.out.println(movieAdd);
        System.out.println(movieGet);
    }
}
