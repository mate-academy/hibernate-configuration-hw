package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Inject;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    @Inject
    public static void main(String[] args) {
        MovieDao movieDao = new MovieDaoImpl();
        Movie firstMovie = new Movie();
        firstMovie.setTitle("Dune");
        firstMovie.setDescription("Great film!");
        Movie secondMovie = new Movie();
        secondMovie.setTitle("Dune");
        secondMovie.setDescription("Great film!");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        System.out.println(movieService.add(firstMovie));
        System.out.println(movieService.add(secondMovie));
        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
    }
}
