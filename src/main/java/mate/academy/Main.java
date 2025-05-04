package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie kimiNoNawa = new Movie();
        kimiNoNawa.setTitle("Kimi no Nawa");
        kimiNoNawa.setDescription("Cool romantic anime!");
        movieService.add(kimiNoNawa);

        System.out.println(movieService.get(kimiNoNawa.getId()));
    }
}
