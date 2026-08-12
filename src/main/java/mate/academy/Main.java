package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie term1 = new Movie();
        term1.setTitle("terminator 1");
        term1.setDescription("I'll be back");
        Movie term2 = new Movie();
        term2.setTitle("terminator 2");
        term2.setDescription("save all");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(term1);
        movieService.add(term2);
        Movie movieGet1 = movieService.get(1L);
        Movie movieGet2 = movieService.get(2L);
        System.out.println(movieGet1);
        System.out.println(movieGet2);
    }
}
