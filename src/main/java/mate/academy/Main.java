package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final String MOVIE_TITLE = "Best of All";
    private static final String MOVIE_DESC = "Melodrama for 18+";

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle(MOVIE_TITLE);
        movie.setDescription(MOVIE_DESC);
        movieService.add(movie);
        movieService.get(movie.getId());
    }
}
