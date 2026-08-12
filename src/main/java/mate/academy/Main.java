package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.services.MovieService;

public class Main {
    private static Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieDao movieDao = new MovieDaoImpl();

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();

        movie.setTitle("The Shawshank Redemption");
        movie.setDescription("Description");

        Movie addedMovie = movieService.add(movie);
        Movie foundMovie = movieService.get(1L);

        System.out.println("ADDED " + addedMovie.toString());
        System.out.println("FOUND " + foundMovie.toString());
    }
}
