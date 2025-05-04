package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {

    private static final String PACKAGE_NAME = "mate.academy";
    private static final Injector injector = Injector.getInstance(PACKAGE_NAME);

    public static void main(String[] args) {

        var movieService = (MovieService) injector.getInstance(MovieService.class);
        var movie = new Movie.Builder()
                .setTitle("Moneyball")
                .setDescription("The story of Oakland A's general manager Billy "
                        + "Beane's successful attempt to put together a baseball "
                        + "club on a budget by employing computer-generated analysis"
                        + " to draft his players.")
                .build();

        var addedMovie = movieService.add(movie);
        System.out.println(addedMovie);

        System.out.println("Movie by id: " + movie.getId() + " is "
                + movieService.get(movie.getId()));
    }
}
