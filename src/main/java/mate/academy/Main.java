package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {

        Movie titanicMovie = new Movie();
        titanicMovie.setTitle("Titanic");
        titanicMovie.setDescription("Unsinkable ship sunk");
        movieService.add(titanicMovie);

        Movie terminator2Movie = new Movie();
        terminator2Movie.setTitle("Terminator 2");
        terminator2Movie.setDescription("Now with a good cyborg!");
        movieService.add(terminator2Movie);

        System.out.println(movieService.get(titanicMovie.getId()));
        System.out.println(movieService.get(terminator2Movie.getId()));
    }
}
