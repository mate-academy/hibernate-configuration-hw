package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("The Godfather");
        movie.setDescription(
                "The gangster saga The Godfather is one of the best films of all time.");
        movieService.add(movie);
        Movie savedMovie = movieService.get(1L);
        System.out.println(savedMovie);
    }
}
