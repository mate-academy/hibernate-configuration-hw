package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;

public class Main {
    private static final Injector inject = Injector.getInstance("mate.academy");
    private static final MovieDao movieDao = (MovieDao) inject.getInstance(MovieDao.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setDescription("wow movie");
        movie.setTitle("interstellar");
        movieDao.add(movie);

        System.out.println(movieDao.get(1L));
    }
}
