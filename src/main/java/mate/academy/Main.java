package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService manufacturerService = (MovieService) injector
                .getInstance(MovieService.class);

        Movie movieIsaura = new Movie("Escrava Isaura", "Awesome film");
        Movie movieClone = new Movie("O Clone", "Brazilian telenovela");

        movieIsaura = manufacturerService.add(movieIsaura);
        movieClone = manufacturerService.add(movieClone);
        System.out.println(movieIsaura);
        System.out.println(movieClone);

        System.out.println(manufacturerService.get(movieIsaura.getId()));
        System.out.println(manufacturerService.get(movieClone.getId()));
    }
}
