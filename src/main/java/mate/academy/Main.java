package mate.academy;

import mate.academy.entity.Movie;
import mate.academy.lib.Injector;
import mate.academy.service.MovieService;

public class Main {

    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Some Movie");
        movie.setDescription("Interesting film");
        movieService.add(movie);

    }
}
