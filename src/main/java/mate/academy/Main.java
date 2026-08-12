package mate.academy;

import mate.academy.lib.Inject;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    @Inject
    private static MovieService movieService;

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Harry Potter ");
        movie.setDescription("Cool");
        movieService.add(movie);

        movie.setTitle("Harry Potter 2");
        movie.setDescription("Super Cool");
        movieService.add(movie);

        Movie movieFromDB = movieService.get(2L);
    }
}
