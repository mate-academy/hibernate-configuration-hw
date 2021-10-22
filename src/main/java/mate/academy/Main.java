package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService
            = (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie homeAlone = new Movie();
        homeAlone.setTitle("Home alone");
        System.out.println(movieService.add(homeAlone));
        System.out.println(movieService.get(homeAlone.getId()));
        Movie fargo = new Movie();
        homeAlone.setTitle("Fargo");
        System.out.println(movieService.add(fargo));
        System.out.println(movieService.get(fargo.getId()));
    }
}
