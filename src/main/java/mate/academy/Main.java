package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;

public class Main {
    public static void main(String[] args) {
        Injector inject = (Injector) Injector.getInstance("mate.academy");
        MovieDao movieDao = (MovieDao) inject.getInstance(MovieDao.class);

        Movie movie = new Movie();
        movie.setTitle("Terminator");
        movie.setDescription("all be back");

        movieDao.add(movie);
        movieDao.get(1L).get();
    }
}
