package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.movie.MovieService;

public class Main {
    public static void main(String[] args) {
        final MovieService movieService
                = (MovieService) Injector.getInstance("mate.academy")
                .getInstance(MovieService.class);
        Movie movie = new Movie("Titanic", "romance, drama");
        movieService.add(movie);
        movieService.get(movie.getId());
    }
}
