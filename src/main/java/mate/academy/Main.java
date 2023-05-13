package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate");

    public static void main(String[] args) {
        MovieService movieService =
                (MovieService) INJECTOR.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("The Guardians of Galaxy");
        movie.setDescription("fantasy movie");
        movieService.add(movie);

        Movie retrievedMovie = movieService.get(1L);
        System.out.println(retrievedMovie.getId());
        System.out.println(retrievedMovie.getTitle());
        System.out.println(retrievedMovie.getDescription());
    }
}
