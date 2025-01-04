package mate.academy;

import java.util.ArrayList;
import java.util.List;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final Long MOVIE_ID = 3L;

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        List<Movie> movieList = new ArrayList<>();
        Movie movie1 = new Movie("Nosferatu", "Horror film");
        Movie movie2 = new Movie("Titanic", "Drama film");
        Movie movie3 = new Movie("Interstellar", "Space film");
        Movie movie4 = new Movie("6th sense", "Drama film");
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);

        for (Movie movie : movieList) {
            movieService.add(movie);
        }

        Movie movieById = movieService.get(MOVIE_ID);
        System.out.println(movieById);
    }
}
