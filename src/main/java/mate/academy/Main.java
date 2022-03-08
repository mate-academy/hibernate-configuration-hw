package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(createMovie());
        Movie movie = movieService.get(1L);
        System.out.println(movie);
    }

    private static Movie createMovie() {
        Movie movie = new Movie();
        movie.setDescription("American buddy drama film written and directed by Mike Binder");
        movie.setTitle("Reign Over Me");
        return movie;
    }
}
