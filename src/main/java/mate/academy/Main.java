package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieDao movieDao = (MovieDao) INJECTOR.getInstance(MovieDao.class);
        Movie movie = new Movie();
        movie.setTitle("Jack");
        movie.setDescription("good");
        movieDao.add(movie);

        System.out.println(movieDao.get(1L));
    }
}
