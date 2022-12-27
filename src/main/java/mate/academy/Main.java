package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.servise.MovieService;

public class Main {
    private static Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie pinocchio = new Movie();
        pinocchio.setTitle("Pinocchio");
        pinocchio.setDescription("Ferry tail");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        System.out.println(movieService.get(2L));
    }
}
