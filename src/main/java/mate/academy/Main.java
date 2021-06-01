package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService = (MovieService)
            injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Avatar");
        movie.setDescription("12+");
        movieService.add(movie);

        Movie movieFromDbById = movieService.get(movie.getId());
        System.out.println(movieFromDbById);
    }
}
