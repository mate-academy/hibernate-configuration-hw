package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setDescription("movie 1");
        movie1.setTitle("movie 1");

        Movie movie2 = new Movie();
        movie2.setDescription("movie 2");
        movie2.setTitle("movie 2");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(movie1);
        movieService.add(movie2);
        movieService.get(1L);
    }
}
