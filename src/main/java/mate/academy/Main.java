package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        final MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie firstMovie = new Movie();
        firstMovie.setTitle("FirstMovieTitle");
        firstMovie.setDescription("FirstMovieDesc");

        Movie secondMovie = new Movie();
        secondMovie.setTitle("secondMovieTitle");
        secondMovie.setDescription("secondMovieDesc");

        movieService.add(firstMovie);
        movieService.add(secondMovie);

        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
    }
}
