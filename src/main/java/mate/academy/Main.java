package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.dao.impl.MovieDaoImpl;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.impl.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        MovieDao movieDao = new MovieDaoImpl();
        MovieService movieService = new MovieServiceImpl(movieDao);

        Movie movie = new Movie();
        movie.setTitle("Inception");
        movieService.add(movie);

        Movie retrievedMovie = movieService.get(movie.getId());
        System.out.println("Movie retrieved: " + retrievedMovie.getTitle());
    }
}
