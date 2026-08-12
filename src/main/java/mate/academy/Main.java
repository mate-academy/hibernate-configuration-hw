package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {

    private static final Injector injector =
            Injector.getInstance("mate.academy");
    private static final MovieService movieService = (MovieService)
            injector.getInstance(MovieService.class);

    public static void main(String[] args) {

        Movie movie = new Movie();
        movie.setTittle("Terminator");

        Movie movie2 = new Movie();
        movie2.setTittle("Terminator2");

        movieService.add(movie);
        movieService.add(movie2);

        Movie movieFromGet = movieService.get(movie2.getId());
        System.out.println(movieFromGet);

    }
}
