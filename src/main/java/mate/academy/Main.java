package mate.academy;

import mate.academy.domain.MovieService;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        System.out.println("Creating spiderman movie: ");
        Movie spidermanMovie = new Movie();
        spidermanMovie.setTitle("Spiderman");
        spidermanMovie.setDescription("A classic movie from the Marvel universe");
        System.out.println(spidermanMovie);

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        System.out.println("Adding spiderman movie to the DB");
        movieService.add(spidermanMovie);

        System.out.println("Trying to get spiderman movie from the DB");
        System.out.println("Result: ");
        System.out.println(movieService.get(spidermanMovie.getId()));

    }
}
