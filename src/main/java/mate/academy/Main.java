package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie firstMovie = movieService
                .add(new Movie("The Green Mile", "He was a good guy"));
        Movie secondMovie = movieService
                .add(new Movie("Star wars", "Just a good one"));
        System.out.println(movieService.get(firstMovie.getId()).toString()
                + movieService.get(secondMovie.getId()).toString());
    }
}
