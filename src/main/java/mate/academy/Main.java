package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.lib.model.Movie;
import mate.academy.lib.service.MovieService;

public class Main {
    public static void main(String[] args) {

        Injector injector = Injector.getInstance("mate.academy.lib");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setDescription("Movie description");
        movie.setTitle("Movie title");
        movieService.add(movie);
        System.out.println(movieService.get(1L));

    }
}
