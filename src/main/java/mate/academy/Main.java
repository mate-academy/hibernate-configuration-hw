package mate.academy;

import mate.academy.lib.Inject;
import mate.academy.model.Movie;
import mate.academy.service.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {

        @Inject
        MovieServiceImpl movieService = null;

        Movie movie = new Movie();
        movie.setTitle("Superman");
        movie.setDescription("Super film!");

        movieService.add(movie);
        movieService.get(1L);

    }
}
