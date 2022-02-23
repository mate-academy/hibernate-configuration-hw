package mate.academy;

import java.util.Arrays;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static MovieService movieService;

    static {
        Injector injector = Injector.getInstance("mate.academy");
        movieService = (MovieService) injector
                .getInstance(MovieService.class);
    }

    public static void main(String[] args) {
        Movie batmanMovie = new Movie();
        batmanMovie.setTitle("Batman");
        batmanMovie.setDescription("About DC");
        Movie nemoMovie = new Movie();
        nemoMovie.setTitle("Nemo");
        nemoMovie.setDescription("About fish trip");
        System.out.println("Saving movies: ");
        showMovies(batmanMovie, nemoMovie);
        movieService.add(batmanMovie);
        movieService.add(nemoMovie);
        System.out.println("Movies after saving: ");
        showMovies(batmanMovie, nemoMovie);
        System.out.println("Getting movies by Ids: ");
        showMovies(batmanMovie.getId(),
                movieService.get(batmanMovie.getId()));
        showMovies(nemoMovie.getId(),
                movieService.get(nemoMovie.getId()));
    }

    private static void showMovies(Movie...movies) {
        Arrays.stream(movies).forEach(System.out::println);
    }

    private static void showMovies(Long id, Movie movie) {
        System.out.println("Movie by id " + id + ": " + movie);
    }
}
