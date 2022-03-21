package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Terminator 2");
        movie.setDescription("Awesome movie");
        Movie returnedMovie = movieService.add(movie);

        Movie movieFromDB = movieService.get(returnedMovie.getId());
        System.out.println("movieFromDB: " + movieFromDB);
    }
}
