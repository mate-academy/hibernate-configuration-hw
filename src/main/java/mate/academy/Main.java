package mate.academy;

import mate.academy.dao.MovieServiceImpl;
import mate.academy.lib.DataProcessingException;
import mate.academy.lib.MovieService;
import mate.academy.model.Movie;

public class Main {
    public static void main(String[] args) throws DataProcessingException {
        final MovieService movieService = new MovieServiceImpl();

        Movie movie = new Movie();
        movie.setId(1L);
        movie.setTitle("Movie 1");
        movie.setDescription("Description 1");
        movieService.add(movie);
        movieService.get(1L);

        movie = new Movie();
        movie.setId(2L);
        movie.setTitle("Movie 2");
        movie.setDescription("Description 2");
        movieService.add(movie);
        movieService.get(2L);
    }
}
