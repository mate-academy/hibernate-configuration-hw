package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector instance = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) instance.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Not ok");
        movie.setDescription("ok");
        movieService.add(movie);
        System.out.println(movieService.get(movie.getId()));
    }
}
