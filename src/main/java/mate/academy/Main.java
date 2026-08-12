package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.lib.Movie;
import mate.academy.lib.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Inception");
        movie.setDescription("Sci-fi");

        movieService.add(movie);

        Movie savedMovie = movieService.get(movie.getId());
        System.out.println(savedMovie.getTitle());

    }
}
