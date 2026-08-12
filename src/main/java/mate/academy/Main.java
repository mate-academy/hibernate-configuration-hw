package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector
            = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Dune");
        movie.setDescription("Awesome fantastic movie");
        MovieService movieService
                = (MovieService) injector.getInstance(MovieService.class);
        Movie addMovieToDB = movieService.add(movie);
        Movie getMovieFromDB = movieService.get(addMovieToDB.getId());
        System.out.println(getMovieFromDB);
    }
}
