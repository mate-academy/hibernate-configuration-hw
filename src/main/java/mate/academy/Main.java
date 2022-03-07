package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setName("Snatch");
        movie.setDescription("Snatch movie");
        movieService.add(movie);
        movie = movieService.get(movie.getId());
        System.out.println("returned by movieService:" + movie);
    }
}
