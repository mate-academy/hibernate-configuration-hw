package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {

        Movie movie = new Movie();
        movie.setTitle("GoT");
        movie.setDescription("Story about love, politic and war");

        System.out.println("Step 1. Save data");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(movie);
        System.out.println(movie);

        System.out.println("Step 2. Read");
        System.out.println(movieService.get(movie.getId()));

    }
}
