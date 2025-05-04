package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieDao movieDao =
            (MovieDao) injector.getInstance(MovieDao.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("GLADIATOR");
        movie.setDescription("One of the best movies ever!");
        movieDao.add(movie);
        System.out.println(movieDao.get(movie.getId()));
        // success
    }
}
