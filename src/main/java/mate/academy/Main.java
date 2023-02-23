package mate.academy;

import java.util.zip.DataFormatException;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) throws DataFormatException {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Cocaine Bear");
        movie.setDescription("Tense and unprecedented thriller based on real events");
        Movie addMovieToDB = movieService.add(movie);
        Movie getMovieFromDB = movieService.get(1L);
    }
}
