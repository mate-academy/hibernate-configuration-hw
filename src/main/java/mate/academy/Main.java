package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);

        Movie firstMovie = new Movie("Mad Max", "action movie");
        System.out.println(movieDao.add(firstMovie));

        Movie secondMovie = new Movie("Cinderella", "fairy tale");
        System.out.println(movieDao.add(secondMovie));

        Movie thirdMovie = new Movie("The Lion King", "cartoon");
        System.out.println(movieDao.add(thirdMovie));

        System.out.println(movieDao.get(2L));
    }
}
