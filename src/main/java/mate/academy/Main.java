package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieDao movieService = (MovieDao) injector.getInstance(MovieDao.class);
        Movie movie = new Movie();
        movie.setTitle("Sapience");
        movieService.add(movie);
        System.out.println(movieService.get(1L));
    }
}
