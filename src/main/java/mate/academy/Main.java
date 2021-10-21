package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector
                .getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Lord of the Rings");
        movie.setDescription("The Lord of the Rings is a series of three epic fantasy adventure "
                + "films directed by Peter Jackson,"
                + " based on the novel written by J. R. R. Tolkien.");
        Movie addedMovie = movieService.add(movie);
        System.out.println(addedMovie);
        Movie gotMovie = movieService.get(1L);
        System.out.println(gotMovie);
    }
}
