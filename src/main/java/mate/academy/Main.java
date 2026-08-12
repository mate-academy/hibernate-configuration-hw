package mate.academy;

import mate.academy.dao.MovieDaoImpl;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        MovieService movieService = new MovieServiceImpl(new MovieDaoImpl());

        Movie movie = new Movie();
        movie.setTitle("Inception");
        movie.setDescription("A sci-fi thriller");

        movieService.add(movie);
        System.out.println(movieService.get(movie.getId()));
    }
}
