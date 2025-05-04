package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("fast and furious 9");
        movie.setDescription("awesome film");
        movieService.add(movie);
        Movie movieFromDB = movieService.get(1L);
        System.out.println(movieFromDB);
    }
}
