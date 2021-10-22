package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector =
            Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService)
                injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Iron man 3");
        movie.setDescription("Marvel studio's movie");
        movie = movieService.add(movie);
        Movie movieGetById = movieService.get(1L);
        System.out.println(movie);
        System.out.println(movieGetById);
    }
}
