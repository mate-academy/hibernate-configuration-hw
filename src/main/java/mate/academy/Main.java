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
                new Movie("Avengers", "watch this if you want some fantasy"),
                new Movie("Aladdin", "watch this if you want nostalgia")
         );

        movies.stream()
                .map(movieService::add)
                .forEach(System.out::println);
        System.out.println(movieService.get(2L));
    }
}
