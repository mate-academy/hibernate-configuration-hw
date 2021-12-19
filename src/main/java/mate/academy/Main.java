package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie homeAlone = new Movie();
        homeAlone.setTitle("Home alone");
        homeAlone.setDescription("Christmas comedy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        System.out.println(movieService.add(homeAlone));
        System.out.println(movieService.get(homeAlone.getId()));
    }
}
