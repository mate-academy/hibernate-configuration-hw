package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        final Injector injector = Injector.getInstance("mate.academy");
        final MovieService movieService = (MovieService) injector
                 .getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Friends");
        movie.setDescription("Nice TV show");
        movieService.add(movie);
        Movie movie1 = movieService.get(1L);
        System.out.println(movie1);
    }
}
