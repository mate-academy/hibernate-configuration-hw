package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) throws DataProcessingException {
        MovieService service = (MovieServiceImpl) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        service.add(movie);
    }
}
