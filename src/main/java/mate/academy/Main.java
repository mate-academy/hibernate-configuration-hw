package mate.academy;

import mate.academy.dao.MovieDaoImpl;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    public static void main(String[] args) throws Exception {
        MovieService movieService = new MovieServiceImpl(new MovieDaoImpl());

        Movie movie = new Movie("Inception", "A mind-bending thriller");
        movieService.add(movie);

        Movie retrievedMovie = movieService.get(movie.getId());
        System.out.println("Retrieved movie: " + retrievedMovie.getTitle());
    }
}
