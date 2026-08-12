package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Movie movieCommon = new Movie();
    private static final Movie movie = new Movie();
    private static final Injector injector = Injector.getInstance("mate.academy");

    static {
        movieCommon.setDescription("dniiuiu21");
        movieCommon.setTitle("dno44444");
        movie.setTitle("Mister Newbie");
        movie.setDescription("Don't watch this in any case!!");
    }

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        movieService.add(movie);

        System.out.println(movieService.add(movieCommon));
        System.out.println(movieService.get(1L));
    }
}
