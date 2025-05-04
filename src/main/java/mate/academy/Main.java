package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate");
        MovieService movieService
                = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Matrix");
        movie.setDescription("The world of the Matrix is an illusion.");
        movieService.add(movie);
        System.out.println(movieService.get(movie.getId()));

    }
}
