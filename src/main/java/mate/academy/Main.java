package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {

    }
}
