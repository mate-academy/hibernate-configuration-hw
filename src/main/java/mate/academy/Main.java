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
        Movie terminatorMovie = new Movie();
        terminatorMovie.setTitle("Terminator 5");
        terminatorMovie.setDescription("About robots");
        Movie matrixMovie = new Movie();
        matrixMovie.setTitle("Matrix");
        matrixMovie.setDescription("About virtual reality");
        System.out.println("Saving movies: ");
        showMovies(terminatorMovie, matrixMovie);
        movieService.add(terminatorMovie);
        movieService.add(matrixMovie);
        System.out.println("Movies after saving: ");
        showMovies(terminatorMovie, matrixMovie);
        System.out.println("Getting movies by Ids: ");
        showMovies(terminatorMovie.getId(),
                movieService.get(terminatorMovie.getId()));
        showMovies(matrixMovie.getId(),
                movieService.get(matrixMovie.getId()));
    }

    private static void showMovies(Movie... movies) {
        Arrays.stream(movies).forEach(System.out::println);
    }

    private static void showMovies(Long id, Movie movie) {
        System.out.println("Movie by id " + id + ": " + movie);
    }
}
