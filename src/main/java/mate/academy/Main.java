package mate.academy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        List<Movie> movies = new ArrayList<>();
        IntStream.range(0, 5)
                .forEach(i -> {
                    Movie movie = new Movie("Movie №" + i, "This is a movie №" + i);
                    movies.add(movie);
                });
        movies.forEach(movieService::add);
        IntStream.range(0, movies.size())
                .forEach(i -> System.out.println(movieService.get(Long.valueOf(i))));
    }
}
