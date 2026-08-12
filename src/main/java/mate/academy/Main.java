package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Movie MOVIE_FIRST = new Movie();
    private static final Movie MOVIE_SECOND = new Movie();
    private static final Injector injector = Injector.getInstance("mate.academy");

    static {
        MOVIE_FIRST.setTitle("Mad Max");
        MOVIE_FIRST.setDescription("Action");
        MOVIE_SECOND.setTitle("MIB");
        MOVIE_SECOND.setDescription("Comedy/Action");
    }

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(MOVIE_SECOND);
        System.out.println(movieService.add(MOVIE_FIRST));
        System.out.println(movieService.get(1L));
    }
}
