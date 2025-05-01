package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Inception");
        movie.setDescription("Sci-fi thriller by Christopher Nolan");

        Movie addedMovie = movieService.add(movie);
        System.out.println("Movie added: " + addedMovie.getId());

        Movie fetchedMovie = movieService.get(addedMovie.getId());
        System.out.println("Fetched movie: " + fetchedMovie.getTitle());
    }
}
