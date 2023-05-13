package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie term1 = new Movie("terminator 1", "I'll be back");
        Movie term2 = new Movie("terminator 2", "save all");
        movieService.add(term1);
        movieService.add(term2);
        Movie movieGet1 = movieService.get(1L);
        Movie movieGet2 = movieService.get(2L);
        System.out.println(movieGet1);
        System.out.println(movieGet2);
    }
}
