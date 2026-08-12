package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.service.MovieService;
import mate.academy.service.impl.MovieServiceImpl;

public class Main {
    public static final String MAIN_PACKAGE_NAME = "mate.academy";
    private static final Injector injector =
            Injector.getInstance(MAIN_PACKAGE_NAME);

    public static void main(String[] args) {
        MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);
        MovieService movieService = new MovieServiceImpl(movieDao);
    }
}
