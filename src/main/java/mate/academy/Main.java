package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Space for dummies");
        movie.setDescription("you would not believe, how many people think that the earth is flat");
        movieService.add(movie);
        System.out.println(movieService.get(movie.getId()));
    }
}
