package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("The Lord of the Rings: The Fellowship of the Ring");
        movie.setDescription("Sauron lost the ring, Frodo and friends journey to destroy it.");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(movie);
        Movie movieFromDB = movieService.get(1L);
        System.out.println(movieFromDB);
    }
}
