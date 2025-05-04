package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static MovieService movieService = (MovieService)
            injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie titanicMovie = new Movie();
        titanicMovie.setTitle("Titanic");
        titanicMovie.setDescription("American epic romance and disaster film");
        movieService.add(titanicMovie);

        Movie warMovie = new Movie();
        warMovie.setTitle("1917");
        warMovie.setDescription("War film directed and produced by Sam Mendes");
        movieService.add(warMovie);

        System.out.println(movieService.get(2L));
    }
}
