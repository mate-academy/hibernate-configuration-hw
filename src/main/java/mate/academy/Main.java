package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie("Interstaller", "great since faction");
        Movie movie1 = new Movie("aaa", "finallyyyyyyyyyy");
        movieService.add(movie);
        movieService.add(movie1);
        System.out.println(movieService.get(movie1.getId()));
        System.out.println(movieService.get(movie.getId()));
    }
}
