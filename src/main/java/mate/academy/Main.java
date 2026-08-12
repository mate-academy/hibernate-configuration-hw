package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector
            .getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Titanic");
        movie.setDescription("Titanic is an American romantic adventure film, "
                + "released in 1997, that centers on the sinking of the RMS Titanic.");
        movieService.add(movie);

        Movie movieFromDb = movieService.get(1L);
        System.out.println(movieFromDb);
    }
}
