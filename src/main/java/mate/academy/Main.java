package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Terminator");
        movie.setDescription("Awesome movie");
        movieService.add(movie);
        System.out.println("Added: " + movie);

        System.out.println("Found by ID: " + movieService.get(movie.getId()));

        movie.setTitle("Fast and Furious 3");
        movie.setDescription("Nice");
        System.out.println("Updated: " + movieService.update(movie));

        movieService.delete(movie.getId());
        System.out.println("Deleted by ID: " + movie.getId());
    }
}
