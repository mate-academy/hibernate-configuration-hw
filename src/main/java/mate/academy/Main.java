package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.lib.model.Movie;
import mate.academy.lib.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy.lib");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Superhero 5");
        movie.setDescription("Movie about exciting adventures!");

        Movie addedMovie = movieService.add(movie);
        System.out.println(movieService.get(addedMovie.getId()));
    }

}
