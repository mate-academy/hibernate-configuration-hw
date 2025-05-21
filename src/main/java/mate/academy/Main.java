package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Alien");
        movie.setDescription("A sci-fi thriller by Ridley Scott about alien creature.");

        Movie savedMovie = movieService.add(movie);
        System.out.println("Saved Movie: " + savedMovie);

        Movie movieFromDB = movieService.get(savedMovie.getId());
        System.out.println("Retrieved Movie: " + movieFromDB);
    }
}
