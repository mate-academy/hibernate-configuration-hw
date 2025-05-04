package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        MovieDao movieDao = new MovieDaoImpl();
        MovieService movieService = new MovieServiceImpl(movieDao);

        Movie movie = new Movie();
        movie.setTitle("Star Wars");
        movie.setDescription("A long time ago in a galaxy far, far away...");
        movieService.add(movie);

        Movie movieFromDB = movieService.get(1L);
        System.out.println(movieFromDB);
    }
}
