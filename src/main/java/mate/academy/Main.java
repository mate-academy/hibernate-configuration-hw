package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.movieservice.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("12334523");
        movie.setDescription("frfrfrf");
        movieService.add(movie);
        Movie movie1 = movieService.get(1L);
        System.out.println(movie1);
    }
}
