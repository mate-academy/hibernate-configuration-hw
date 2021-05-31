package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static final Injector injector = Injector.getInstance("mate.academy");
    public static final MovieService manufacturerService = (MovieService) injector
            .getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movieIsaura = new Movie("Escrava Isaura", "Awesome film");
        Movie movieClone = new Movie("O Clone", "Brazilian telenovela");

        manufacturerService.add(movieIsaura);
        manufacturerService.add(movieClone);
        System.out.println(movieIsaura);
        System.out.println(movieClone);

        System.out.println(manufacturerService.get(movieIsaura.getId()));
        System.out.println(manufacturerService.get(movieClone.getId()));
    }
}
