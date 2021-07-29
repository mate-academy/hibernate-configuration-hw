package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");

        MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);
        Movie movie1 = new Movie();
        movie1.setTitle("titanic");
        movie1.setDescription("my heart will go oooooon");
        movieDao.add(movie1);
        System.out.println(movieDao.get(1L).get());

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie2 = new Movie();
        movie2.setTitle("terminator");
        movie2.setDescription("hasta la vista");
        movieService.add(movie2);
        System.out.println(movieService.get(2L));
    }
}
