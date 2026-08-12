package mate.academy;

import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = new MovieServiceImpl(new MovieDaoImpl());

        Movie movie = new Movie();
        movie.setTitle("Inception");
        movie.setDescription("A mind-bending thriller by Christopher Nolan.");
        movieService.add(movie);

        Movie retrievedMovie = movieService.get(movie.getId());
        System.out.println("Retrieved movie: " + retrievedMovie.getTitle());

    }
}
