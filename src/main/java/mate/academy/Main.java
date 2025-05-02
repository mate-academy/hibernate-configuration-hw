package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.services.MovieService;
import mate.academy.services.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance(Main.class.getPackageName());
        MovieService movieService = (MovieService) injector.getInstance(MovieServiceImpl.class);

        Movie movie = new Movie();
        movie.setTitle("Spider-Man");
        movie.setDescription("Movie for kids");

        movieService.add(movie);
        System.out.println(movieService.get(1L));
    }
}
