package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        String mainPackageName = "mate.academy";
        Injector injector = Injector.getInstance(mainPackageName);

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        testMovieService(movieService);
    }

    private static void testMovieService(MovieService movieService) {
        Movie movieToAdd = new Movie();
        movieToAdd.setTitle("Sample Title");
        movieToAdd.setDescription("Awesome film");

        Movie addedMovie = movieService.add(movieToAdd);
        Long movieIdToRetrieve = addedMovie.getId();

        Movie retrievedMovie = movieService.get(movieIdToRetrieve);
        System.out.println("Retrieved Movie: " + retrievedMovie);
    }
}
