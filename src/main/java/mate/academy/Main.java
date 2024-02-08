package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.services.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Transformers");
        movie.setDescription("A film about robots capable of being "
                + "either a humanoid robot or transport");

        Movie saved = movieService.add(movie);
        Long savedMovieId = saved.getId();
        Movie movieFromDb = movieService.get(savedMovieId);

        System.out.println(movieFromDb);
    }
}
