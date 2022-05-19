package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    static Injector injector = Injector.getInstance("mate.academy");
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Ocean");
        movie.setDescription("Documentary");
        movieService.add(movie);
    }
}
