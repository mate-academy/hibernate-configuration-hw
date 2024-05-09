package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        final MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);
        Movie movie = new Movie();
        movie.setTitle("geragre");
        movie.setDescription("Cool movie");

        System.out.println(movieDao.add(movie));
        System.out.println(movieDao.get(1L));
    }
}
