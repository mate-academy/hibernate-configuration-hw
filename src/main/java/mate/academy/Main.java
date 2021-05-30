package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie lastIsland = new Movie();
        Movie gameOfThrones = new Movie();
        lastIsland.setTitle("Last Island");
        lastIsland.setDescription("That film about survival ...");
        gameOfThrones.setDescription("Too many blood and dragon's");
        gameOfThrones.setTitle("Game Of Thrones");

        MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);

        System.out.println(movieService.add(lastIsland));
        System.out.println(movieService.add(gameOfThrones));

        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
    }
}
