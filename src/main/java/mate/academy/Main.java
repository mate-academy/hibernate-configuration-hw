package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie interstellar = new Movie();
        interstellar.setTitle("Interstellar");
        interstellar.setDescription("Epic Christopher Nolan movie");
        movieService.add(interstellar);
    }
}
