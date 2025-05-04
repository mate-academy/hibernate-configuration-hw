package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.serivce.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Spider-Man: Far From Home");
        movie.setDescription("Good movie by Marvel Studio");
        movieService.add(movie);
        System.out.println(movieService.get(1L));
    }
}
