package mate.academy;

import mate.academy.dao.impl.MovieDaoImpl;
import mate.academy.model.Movie;
import mate.academy.service.impl.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        MovieServiceImpl movieService = new MovieServiceImpl(new MovieDaoImpl());

        Movie movie = new Movie("SpiderMan", "cartoon");
        movieService.add(movie);

        Movie retrievedMovie = movieService.get(movie.getId());
        System.out.println(retrievedMovie);
    }
}

