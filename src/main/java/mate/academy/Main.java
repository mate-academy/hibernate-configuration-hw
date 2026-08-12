package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("A Minecraft Movie");
        movie.setDescription("A film about cubic world.");

        Movie addedMovie = movieService.add(movie);
        System.out.println(movie + "added successfully!");

        Movie retrievedMovie = movieService.get(addedMovie.getId());
        System.out.printf("Found a movie: " + retrievedMovie);
    }
}
