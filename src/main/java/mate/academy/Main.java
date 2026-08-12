package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setId(1L);
        movie.setTitle("The Hobbit");
        movie.setDescription("The Hobbit");
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(movie);
        System.out.println(movieService.get(1L));
    }
}
