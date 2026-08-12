package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Harry Hotter 1");
        movie.setDescription("A film about the Philosopher's Stone");
        movieService.add(movie);
        System.out.println(movie + " was added");

        Movie movieByIdOne = movieService.get(1L);
        System.out.println("Movie with id 1 = " + movieByIdOne);
    }
}
