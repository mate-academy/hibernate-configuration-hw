package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie testMovie1 = new Movie();
        testMovie1.setTitle("TEST1");
        testMovie1.setDescription("TEST1");

        Movie testMovie2 = new Movie();
        testMovie2.setTitle("TEST2");
        testMovie2.setDescription("TEST2");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        movieService.add(testMovie1);
        movieService.add(testMovie2);

        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
    }
}
