package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie inception = new Movie();
        inception.setTitle("Inception");
        inception.setDescription("Another side of life");

        Movie johnWick = new Movie();
        johnWick.setTitle("John Wick");
        johnWick.setDescription("Everything has a price");

        movieService.add(inception);
        movieService.add(johnWick);

        System.out.println(movieService.get(inception.getId()));
        System.out.println(movieService.get(johnWick.getId()));
    }
}
