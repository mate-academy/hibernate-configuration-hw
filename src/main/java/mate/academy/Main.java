package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate");
    private static MovieService movieService
            = (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie gentlemen = new Movie();
        gentlemen.setTitle("The Gentlemen");
        gentlemen.setDescription("Best movie ever!");

        Movie wrathOfMan = new Movie();
        wrathOfMan.setTitle("Wrath of man");
        wrathOfMan.setDescription("Also very good movie made by Ritchie");

        movieService.add(gentlemen);
        movieService.add(wrathOfMan);

        System.out.println(movieService.get(gentlemen.getId()));
        System.out.println(movieService.get(wrathOfMan.getId()));
    }
}
