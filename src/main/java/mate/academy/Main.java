package mate.academy;

import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Midnight Echoes");
        movie.setDescription("Haunted radio station broadcasts forgotten secrets.");

        System.out.println(movieService.add(movie));

        System.out.println(movieService.get(1L));

        try {
            movieService.get(2L);
        } catch (DataProcessingException e) {
            System.out.println(e.getMessage());
        }
    }
}
