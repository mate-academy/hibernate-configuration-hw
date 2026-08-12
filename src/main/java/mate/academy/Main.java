package mate.academy;

import mate.academy.lib.Inject;
import mate.academy.model.Movie;
import mate.academy.services.MovieService;
import mate.academy.services.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        @Inject
        MovieService movieService = new MovieServiceImpl();
        Movie movie = new Movie();
        movie.setTitle("Harry Potter and Deathly Hallows: Part 1");
        movie.setDescription("Wizard world 7th film");
        System.out.println(movieService.add(movie));
        System.out.println(movieService.get(1L));

    }
}
