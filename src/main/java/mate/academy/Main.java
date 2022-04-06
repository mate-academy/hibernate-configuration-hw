package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie1 = new Movie();
        movie1.setTitle("Avengers");
        movieService.add(movie1);
        System.out.println("movie1 added");
        Movie movie2 = new Movie();
        movie2.setTitle("Potter");
        movieService.add(movie2);
        System.out.println("movie2 added");
        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
    }
}
