package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Terminator");
        movie.setDescription("Awesome movie");
        MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);

        movieDao.add(movie);
        movieDao.get(1L);
    }
}
