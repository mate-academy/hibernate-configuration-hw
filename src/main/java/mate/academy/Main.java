package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector
            = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Matrix");
        movie.setDescription("Neo choosing pill.");

        movieService.add(movie);
        System.out.println("Film successfully added.");

        Movie gotMovie = movieService.get(movie.getId());

        System.out.println(gotMovie.toString());
    }
}
