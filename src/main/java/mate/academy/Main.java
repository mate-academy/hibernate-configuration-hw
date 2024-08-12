package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");

        Movie movie = new Movie();
        movie.setTitle("Pulp fiction");
        movie.setDecription("Pulp Fiction is a 1994 American independent crime film "
                + "written and directed by Quentin Tarantino "
                + "from a story he conceived with Roger Avary.");

        MovieService movieService = (MovieServiceImpl) injector.getInstance(MovieService.class);
        movieService.add(movie);

        System.out.println(movieService.get(1L));

    }
}
