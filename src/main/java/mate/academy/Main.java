package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Movie FIRST_DEFAULT_MOVIE = new Movie("aaa", "bbb");
    private static final Movie SECOND_DEFAULT_MOVIE = new Movie("ccc", "ddd");
    private static final Movie THIRD_DEFAULT_MOVIE = new Movie("eee", "fff");
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        movieService.add(FIRST_DEFAULT_MOVIE);
        movieService.add(SECOND_DEFAULT_MOVIE);
        movieService.add(THIRD_DEFAULT_MOVIE);
        System.out.println(movieService.get(2L));
        System.out.println(movieService.get(3L));
    }
}
