package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieDao movieDao =
            (MovieDao) injector.getInstance(MovieDao.class);

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setTitle("Fast and Furious 9");
        movie1.setDescription("Awesome movie");
        System.out.println(movieDao.add(movie1));
        System.out.println(movieDao.get(movie1.getId()));
    }
}
