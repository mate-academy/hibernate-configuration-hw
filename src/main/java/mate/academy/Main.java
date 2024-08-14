package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
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

        Movie movie1 = new Movie();
        movie1.setTitle("2001: A Space Odyssey ");
        movie1.setDecription("2001: A Space Odyssey is a 1968 epic science fiction film "
                + "produced and directed by Stanley Kubrick");
        MovieDao movieDao = new MovieDaoImpl();
        movieDao.add(movie1);
        System.out.println(movieService.get(1L) + "/n" + movieService.get(2L));

    }
}
