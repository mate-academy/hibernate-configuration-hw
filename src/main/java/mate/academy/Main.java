package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        MovieService movieService = (MovieService) Injector.getInstance("mate.academy")
                .getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Kin-Dza-Dza");
        movie.setDescription("tragicomedy in the genre of fantastic dystopia");
        Movie addedMovie = movieService.add(movie);
        System.out.println(movieService.get(addedMovie.getId()));
    }
}
