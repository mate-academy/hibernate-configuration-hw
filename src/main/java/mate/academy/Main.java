package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Iron man");
        movie.setDescription("Cool movie");

        Movie addMovie = movieService.add(movie);
        System.out.println("add method: " + addMovie);

        Movie getMovieById = movieService.get(1L);
        System.out.println("get bu id method: " + getMovieById);
    }
}
