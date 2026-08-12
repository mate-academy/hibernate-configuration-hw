package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie theGodfather = new Movie("The Godfather", "crime");
        Movie theMatrix = new Movie("The Matrix", "action");
        Movie fightClub = new Movie("Fight Club", "drama");
        movieService.add(theGodfather);
        movieService.add(theMatrix);
        movieService.add(fightClub);
        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
        System.out.println(movieService.get(3L));
    }
}
