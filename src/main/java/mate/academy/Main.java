package mate.academy;

import mate.academy.dao.impl.MovieDaoImpl;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.impl.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        MovieService movieService = new MovieServiceImpl(new MovieDaoImpl());
        Movie movie = new Movie("Halk", "Nice movie! Let's see it!");
        movie = movieService.add(movie);
        System.out.println(movie);
        System.out.println("Read movie: " + movieService.get(movie.getId()));
    }
}
