package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        for (int i = 0; i < 10; i++) {
            movie.setTitle("Fast and Furious " + (i + 1));
            movie.setDescription("Great movie about families and cars.");
            movieService.add(movie);
            Movie movie1 = movieService.get((long) i + 1);
            System.out.println(movie1);
        }
    }
}
