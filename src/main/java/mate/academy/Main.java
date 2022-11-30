package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Lucky man");
        movie.setDescription("Good film");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(movie);
        System.out.println(movieService.get(movie.getId()));
    }
}
