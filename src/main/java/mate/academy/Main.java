package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        MovieService movieService =
                (MovieService) Injector.getInstance("mate.academy.service")
                        .getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setDescription("fjjfh");
        movie.setTitle("jffj");
        movieService.add(movie);

    }
}
