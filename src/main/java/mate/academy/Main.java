package mate.academy;

import java.util.List;
import java.util.stream.Collectors;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        List<Movie> movies = List.of(
                new Movie("Harry Potter", "Magic gay"),
                new Movie("Titanic", "submarine"),
                new Movie("The Cars", "KCHAY"),
                new Movie("The green mile", "I cry"));

        movies.stream().map(movie -> movieService.add((Movie) movie)).collect(Collectors.toList());

        System.out.println(movieService.get(1L));
    }
}
