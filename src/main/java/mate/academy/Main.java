package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie terminator = new Movie();
        terminator.setTitle("Terminator");
        terminator.setDescription("Awesome movie");

        Movie rush = new Movie();
        rush.setTitle("Rush");
        rush.setDescription("Very good movie");

        MovieService movieDao = (MovieService) injector.getInstance(MovieService.class);
        movieDao.add(terminator);
        movieDao.add(rush);
    }
}
