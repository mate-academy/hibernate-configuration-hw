package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        MovieService movieService = (MovieService) Injector.getInstance("mate.academy");

        Movie movie = new Movie();
        movie.setTitle("Terminator9");
        movie.setDescription("Some description!");
        movieService.add(movie);
        Movie movieFromDb = movieService.get(2L);
        System.out.println(movieFromDb);
    }
}
