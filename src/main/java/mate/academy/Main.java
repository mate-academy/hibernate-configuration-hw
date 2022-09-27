package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector =
            Injector.getInstance("mate.academy");
    private static MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Pockemons");
        movie.setDescription("Afoul");
        System.out.println(movieService.add(movie));
        System.out.println(movieService.get(movie.getId()).getTitle());
        System.out.println(movieService.get(movie.getId()).getId());
        System.out.println(movieService.get(movie.getId()).getDescription());
    }
}
