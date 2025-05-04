package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.services.MovieService;

public class Main {

    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Master");
        movie.setDescription("Best of the best");
        Movie movieFromDb = movieService.add(movie);
        System.out.println(movieFromDb);

        Movie getedMovie = movieService.get(1L);
        System.out.println(getedMovie);
    }
}
