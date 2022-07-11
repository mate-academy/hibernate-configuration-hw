package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService =
                (MovieService) INJECTOR.getInstance(MovieService.class);
        Movie theGentlemen = new Movie();
        theGentlemen.setTitle("The Gentlemen");
        theGentlemen.setDescription("Crime action");
        movieService.add(theGentlemen);
        System.out.println(movieService.get(theGentlemen.getId()));

        Movie theGladiator = new Movie();
        theGladiator.setTitle("The Gladiator");
        theGladiator.setDescription("Action");
        movieService.add(theGladiator);
        System.out.println(movieService.get(theGladiator.getId()));
    }
}
