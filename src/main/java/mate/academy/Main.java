package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie oppenheimer = new Movie();
        oppenheimer.setTitle("Oppenheimer");
        movieService.add(oppenheimer);

        Movie movieById = movieService.get(1L);
        System.out.println(movieById);
    }
}

