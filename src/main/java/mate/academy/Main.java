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
        movie.setTitle("Terminator 2");
        movie.setDescription("Some description");
        Movie addedMovie = movieService.add(movie);
        System.out.println("Added new movie: " + addedMovie);

        Movie movieFromDB = movieService.get(1L);
        System.out.println("Movie from DB: " + movieFromDB);
    }
}
