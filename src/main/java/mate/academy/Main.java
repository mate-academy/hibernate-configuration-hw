package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);
        Movie avengers = new Movie("Avengers", "First part");
        Movie secondPartAvengers = new Movie("Avengers 2", "Second part");
        movieDao.add(avengers);
        movieDao.add(secondPartAvengers);
        System.out.println(movieDao.get(avengers.getId()).get());
        System.out.println(movieDao.get(secondPartAvengers.getId()).get());
    }
}
