package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        test(movieService);
    }

    private static void test(MovieService movieService) {
        Movie movie1 = new Movie();
        movie1.setTitle("Forest Gump");
        movie1.setDescription("box of chocolates");

        Movie movie2 = new Movie();
        movie2.setTitle("It");
        movie2.setDescription("Boring");

        movieService.add(movie1);
        movieService.add(movie2);

        System.out.println(movieService.get(2L));
    }
}
