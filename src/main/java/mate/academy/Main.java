package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movie = new Movie();
        Movie movie1 = new Movie();
        movie.setTitle("Test");
        movie.setDescription("Test");
        movie1.setTitle("Test 1");
        movie1.setDescription("Test 1");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(movie1);
        movieService.add(movie);
        System.out.println(movieService.get(1L));
    }
}
