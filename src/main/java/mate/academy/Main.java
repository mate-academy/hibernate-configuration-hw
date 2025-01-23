package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.servise.MovieService;
import mate.academy.servise.MovieServiceImpl;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
         MovieService movieService = new MovieServiceImpl();
        Movie firstMovie = new Movie();
        firstMovie.setTitle("FirstMovieDesc");

        Movie secondMovie = new Movie();
        secondMovie.setTitle("secondMovieTitle");
        secondMovie.setDescription("sendMovieDesc");

        movieService.add(firstMovie);
        movieService.add(secondMovie);

        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));

    }
}
