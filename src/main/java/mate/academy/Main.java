package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final Movie MOVIE = new Movie();
    private static final String TITLE_1 = "The Lord of The Rings";
    private static final String TITLE_2 = "The Hunt";
    private static final Long MOVIE_1 = 1L;
    
    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        MOVIE.setTitle(TITLE_1);
        movieService.add(MOVIE);
        MOVIE.setTitle(TITLE_2);
        movieService.add(MOVIE);
        System.out.println(movieService.get(MOVIE_1));
    }
}
