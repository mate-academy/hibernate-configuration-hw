package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        final MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie1 = new Movie();
        movie1.setTitle("Goose Attack");
        movie1.setDescription("Desperate goose looking for his victim");

        Movie movie2 = new Movie();
        movie2.setTitle("Goose Revenge. No survivors");
        movie2.setDescription("More explosions for highly acclaimed Goose Attack movie");

        movieService.add(movie1);
        movieService.add(movie2);

        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
    }
}
