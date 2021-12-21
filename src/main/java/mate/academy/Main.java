package mate.academy;

import java.util.List;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        List<Movie> movies = List.of(
                new Movie("Drama.setTitle", "Drama.setDescription"),
                new Movie("Action.setTitle", "Action.setDescription"),
                new Movie("Comedy.setTitle", "Comedy.setDescription"),
                new Movie("Fantasy.setTitle", "Fantasy.setDescription"),
                new Movie("Horror.setTitle", "Horror.setDescription"));
        movies.forEach(movieService::add);
        System.out.println(movieService.get(1L));
    }
}
