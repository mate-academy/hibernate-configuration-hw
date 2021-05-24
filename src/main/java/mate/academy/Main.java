package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService = (MovieService) injector
            .getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie scaryMovie =
                movieService.add(new Movie("Scary movie", "Funny movie"));
        Movie americanPsycho =
                movieService.add(new Movie("American psycho", "Scary movie"));

        System.out.println(scaryMovie);
        System.out.println(americanPsycho);

        System.out.println(movieService.get(scaryMovie.getId()));
        System.out.println(movieService.get(americanPsycho.getId()));
    }
}
