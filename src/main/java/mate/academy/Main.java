package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        testMovieService(movieService);
    }

    private static void testMovieService(MovieService movieService) {
        Movie movie1 = new Movie();
        movie1.setTitle("Movie 1");
        movieService.add(movie1);

        Long movieId = movie1.getId();
        Movie retrievedMovie = movieService.get(movieId);
        if (retrievedMovie != null) {
            System.out.println("Retrieved Movie: " + retrievedMovie);
        } else {
            System.out.println("Movie not found.");
        }
    }
}
