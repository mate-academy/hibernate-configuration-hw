package mate.academy;

import java.util.Map;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.services.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Map.of("Dune: Part Two", "Paul Atreides unites with Chani and the Fremen\\.\\.\\.",
                        "Joker: Folie à Deux", "Arthur Fleck meets the love of his life\\.\\.\\.",
                        "A Quiet Place: Day One", "A woman finds herself trapped\\.\\.\\.")
                .forEach((title, description) -> {
                    Movie movie = new Movie();
                    movie.setTitle(title);
                    movie.setDescription(description);
                    System.out.println("An added movie = " + movieService.add(movie));
                });

        System.out.println("The movie by id # 2 = " + movieService.get(2L));
    }
}
