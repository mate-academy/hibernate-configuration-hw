package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    public static void main(String[] args) {
        MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);
        Movie movie = new Movie();
        movie.setTitle("Fast and Furious 9");
        movie.setDescription("Great movie about families and cars.");
        movieDao.add(movie);
        Movie movie1 = movieDao.get(1L).get();
        System.out.println(movie1);
    }
}
