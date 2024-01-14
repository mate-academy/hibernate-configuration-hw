package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Fast and Furious 9");
        movie.setDescription("Action film");

        MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);

        System.out.println(movieDao.add(movie));
        System.out.println(movieDao.get(movie.getId()));
    }
}
