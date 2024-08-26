package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy.dao");

    public static void main(String[] args) {
        MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);

        Movie movie = new Movie();
        movie.setTitle("FILM");
        movie.setDescription("NORM");

        movieDao.add(movie);
        System.out.println(movieDao.get(1L));
    }
}
