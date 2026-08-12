package mate.academy;

import mate.academy.exceptions.DataProcessingException;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    public static void main(String[] args) throws DataProcessingException {
        MovieService movieService = new MovieServiceImpl();
        Movie movie = new Movie();
        movieService.add(movie);
        movie.setId(1L);
        movie.setDescription("horror");
        movie.setTitle("TER");
    }
}
