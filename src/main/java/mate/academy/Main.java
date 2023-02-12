package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Harry Potter and the chamber of secrets");
        movie.setDescription("Second movie about Harry Potter");
        movieService.add(movie);
        Long id = movie.getId();
        System.out.println(movieService.get(id));
    }
}
