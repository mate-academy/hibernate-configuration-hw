package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);

        Movie movie = new Movie();
        movie.setTitle("myMovie");
        movie.setDescription("desc");
        movieService.add(movie, movieDao);

        Movie movie1 = new Movie();
        movie1.setTitle("mymovie1");
        movie1.setDescription("desc1");
        movieService.add(movie1, movieDao);

        System.out.println(movieService.get(23L, movieDao)
                .map(Object::toString)
                .orElse("none found"));

    }
}
