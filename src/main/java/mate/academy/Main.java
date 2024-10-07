package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        MovieService movieService = (MovieService) Injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Harry Potter");
        movie.setDescription("Nice Movie");

        Movie saveMovie = movieService.add(movie);
        Movie getMovie = movieService.get(1L);
        System.out.println(getMovie);
    }
}
