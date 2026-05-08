package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = new Injector("mate.academy");
        MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
    }
}
