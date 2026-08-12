package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.domain.Movie;
import mate.academy.lib.Injector;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy.dao");

    public static void main(String[] args) {
        MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);
        movieDao.add(new Movie("aaaa", "bbbb"));
        movieDao.get(1L);
    }
}
