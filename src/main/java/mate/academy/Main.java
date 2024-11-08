package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieDao dao = (MovieDaoImpl) INJECTOR.getInstance(MovieDaoImpl.class);
        MovieService service = (MovieServiceImpl) INJECTOR.getInstance(MovieServiceImpl.class);

        Movie movie1 = new Movie();
        movie1.setTitle("Terminator 2");
        movie1.setDescription("Best movie!!");

        Movie movie2 = new Movie();
        movie2.setTitle("LOTR 1");
        movie2.setDescription("ALSO Best movie!!");

        service.add(movie1);
        service.add(movie2);

        Movie retrievedMovie = service.get(2L);
        System.out.println(retrievedMovie);
    }
}
