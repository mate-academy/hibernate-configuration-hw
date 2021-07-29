package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie frosen = new Movie();
        frosen.setTitle("Frosen");
        frosen.setDescription("The film depicts a princess");
        Movie sonic = new Movie();
        sonic.setTitle("Sonic");
        sonic.setDescription("Sonic is a blue anthropomorphic hedgehog");
        System.out.println("...Add movie to DB...");
        movieService.add(frosen);
        movieService.add(sonic);
        System.out.println("...Read movie from DB...");
        movieService.get(frosen.getId());
        movieService.get(sonic.getId());
    }
}
