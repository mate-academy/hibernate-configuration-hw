package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.services.MovieService;

public class Main {
    public static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie spongeBob = new Movie();
        spongeBob.setTitle("Sponge Bob");
        spongeBob.setDescription("for kids");
        Movie johnWick = new Movie();
        johnWick.setTitle("John Wick 4");
        johnWick.setDescription("Keanu Reeves...omg");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        System.out.println(movieService.add(spongeBob));
        System.out.println(movieService.add(johnWick));

        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
    }
}
