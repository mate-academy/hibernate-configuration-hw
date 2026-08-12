package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);

        Movie firstMovie = new Movie("Fast and furious", "Very interesting film");
        Movie secondMovie = new Movie("Lord of the rings", "Amazing film");

        movieService.add(firstMovie);
        movieService.add(secondMovie);

        Movie firstMovieFromDB = movieService.get(1L);
        Movie secondMovieFromDB = movieService.get(2L);

        System.out.println(firstMovieFromDB);
        System.out.println(secondMovieFromDB);
    }
}
