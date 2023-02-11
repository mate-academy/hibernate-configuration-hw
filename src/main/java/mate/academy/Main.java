package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Long MOVIE_ID = 1L;
    private static final Injector injector = Injector.getInstance("mate.academy");
    public static final MovieService movieService = (MovieService)
            injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Taxi 2");
        movie.setDescription("The best movie");
        System.out.println(movieService.add(movie));
        System.out.println(movieService.get(MOVIE_ID));
    }
}
