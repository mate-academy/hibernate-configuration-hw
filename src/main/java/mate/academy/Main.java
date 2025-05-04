package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.lib.dao.MovieService;
import mate.academy.model.Movie;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Titan");
        movie.setDescription("Cool movie");

        Movie addMovie = movieService.add(movie);
        Movie movie1 = movieService.get(1L);

        System.out.println(movie1);
        System.out.println(addMovie);
    }
}
