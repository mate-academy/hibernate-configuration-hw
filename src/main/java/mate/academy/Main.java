package mate.academy;

import mate.academy.lib.DataProcessingException;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    public static void main(String[] args) throws DataProcessingException {
        final MovieService movieService = new MovieServiceImpl();

        Movie movie = new Movie();
        movie.setId(1L);
        movie.setTitle("Movie 1");
        movie.setDescription("Description 1");

        System.out.println(movieService.get(1L));
        movieService.add(movie);

        movie = new Movie();
        movie.setId(2L);
        movie.setTitle("Movie 2");
        movie.setDescription("Description 2");
        movieService.add(movie);
        System.out.println(movieService.get(2L));
    }
}
