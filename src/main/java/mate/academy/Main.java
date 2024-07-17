package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy.dao");

    public static void main(String[] args) {
        MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);

        Movie movie = new Movie("Something special","something Ultra Very Special Pro Max");
        movieDao.add(movie);

        Movie getMovie = movieDao.get(1L).orElseThrow();
        System.out.println(getMovie.getTitle() + " " + getMovie.getDescription());
    }
}
