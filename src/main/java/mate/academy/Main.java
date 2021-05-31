package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie shadows = new Movie();
        shadows.setTitle("Shadows of Forgotten Ancestors");
        shadows.setDescription("OST - You Have Already Gone to the Other World");
        movieService.add(shadows);
        System.out.println(shadows);
        System.out.println(movieService.get(shadows.getId()));
    }
}
