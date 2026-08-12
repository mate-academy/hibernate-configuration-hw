package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static Injector injector = Injector.getInstance("mate.academy");
    private static MovieService movieService = (MovieService)
            injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setDescription("boring comedy");
        movie.setTitle("Movie 43");
        movieService.add(movie);
        System.out.println(movieService.get(movie.getId()));
    }
}
