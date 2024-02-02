package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie1 = new Movie("Dota", "2");
        Movie movie2 = new Movie("CS", "2");
        movieService.add(movie1);
        movieService.add(movie2);
        Movie result = movieService.get(movie1.getId());
        System.out.println(result);
    }
}
