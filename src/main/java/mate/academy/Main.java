package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final String PACKAGE_NAME = "mate.academy";
    private static final String MOVIE_NAME = "The Creator";
    private static final String MOVIE_DESCRIPTION = "Humans vs. AI";

    public static void main(String[] args) {
        Injector injector = Injector.getInstance(PACKAGE_NAME);
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle(MOVIE_NAME);
        movie.setDescription(MOVIE_DESCRIPTION);
        movieService.add(movie);
        System.out.println(movie);
        Long id = movie.getId();

        Movie movieInDb = movieService.get(id);
        System.out.println(movieInDb);
    }
}
