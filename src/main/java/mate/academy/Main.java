package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate");
    private static MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        String title = "title";
        String description = "description";
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setDescription(description);
        Long id = movieService.add(movie).getId();
        movieService.get(id);
    }
}
