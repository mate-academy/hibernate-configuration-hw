package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Murder on the Orient Express");
        movie.setDescription("The story of another adventure of the legendary detective");
        movieService.add(movie);
        System.out.println(movieService.get(movie.getId()));
    }
}
