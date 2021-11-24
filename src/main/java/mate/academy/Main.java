package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService
            = (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie warcraft = new Movie();
        warcraft.setTitle("Warcraft");
        warcraft.setDescription("Movie based on a video game World of Warcraft");
        Movie butterfly = new Movie();
        butterfly.setTitle("Butterfly");
        butterfly.setDescription("Jailbreak movie");
        System.out.println(movieService.add(warcraft));
        System.out.println(movieService.get(warcraft.getId()));
        System.out.println(movieService.add(butterfly));
        System.out.println(movieService.get(butterfly.getId()));
    }
}
