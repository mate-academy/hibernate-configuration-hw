package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("An autumn in New York");
        movie.setDescription("a movie about love");

        Movie addedMovie = movieService.add(movie);
        System.out.println("Added movie: " + addedMovie);

        Movie retrievedMovie = movieService.get(addedMovie.getId());
        System.out.println("Retrieved movie: " + retrievedMovie);
    }
}
