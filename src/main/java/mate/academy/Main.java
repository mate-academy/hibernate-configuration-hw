package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Lost");
        movie.setDescription("oaoaoao movie!!!");

        movieService.add(movie);

        Movie movieFromDb = movieService.get(1L);

        System.out.println(movieFromDb.toString());
    }
}
