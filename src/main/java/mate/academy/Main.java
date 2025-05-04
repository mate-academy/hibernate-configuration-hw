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
        movie.setTitle("Jumanji");
        movie.setDescription("Jumanji is a 1995 American fantasy adventure film "
                + "directed by Joe Johnston from a screenplay by Jonathan Hensleigh, "
                + "Greg Taylor, and Jim Strain.");
        movieService.add(movie);
        System.out.println(movieService.get(1L));
    }
}
