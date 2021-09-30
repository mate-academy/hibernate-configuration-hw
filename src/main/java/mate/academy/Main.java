package mate.academy;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Operation 'I'", "comedy"));
        movies.add(new Movie("Black panther", "drama"));
        movies.add(new Movie("Oxygen", "thriller"));

        movies.forEach(movieService::add);

        for (Long i = 1L; i <= movies.size(); i++) {
            System.out.println(movieService.get(i));
        }

        try {
            movieService.get((long) (movies.size() + 1));
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}
