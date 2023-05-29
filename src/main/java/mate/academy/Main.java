package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Flash");
        movie.setDescription("very interesting movie");
        movieService.add(movie);

        Movie movieGet = movieService.get(1L);
        System.out.println(movieGet);

        Movie movieAdd = movieService.get(1L);
        System.out.println(movieAdd);
    }
}
