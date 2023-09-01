package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.models.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");
    private static final MovieService MOVIE_SERVICE = (MovieService) INJECTOR
            .getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Sony 5");
        movie.setDescription("Livery");
        MOVIE_SERVICE.add(movie);
    }
}
