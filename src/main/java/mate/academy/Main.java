package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");

        Movie movie = (Movie) injector.getInstance(MovieDao.class);
        movie.setTitle("Pulp fiction");
        movie.setDecription("Pulp Fiction is a 1994 American independent crime film "
                + "written and directed by Quentin Tarantino "
                + "from a story he conceived with Roger Avary.");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(movie);

    }
}
