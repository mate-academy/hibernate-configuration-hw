package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static Injector injector;
    private static MovieService movieService;
    public static void main(String[] args) {
        Injector.getInstance("mate");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("X-MEN");
        movie.setDescription("Superhero movie");
        movieService.add(movie);
        System.out.println(movieService.get(movie.getId()));
    }
}
