package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {

    public static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setDescription("Awesome movie");
        movie.setTitle("Django Unchained");

        movieService.add(movie);

        movie.setId(null);
        movie.setTitle("Interstellar");
        movie.setDescription("Nice movie");

        movieService.add(movie);
        movieService.get(1L);
        movieService.get(2L);
    }
}
