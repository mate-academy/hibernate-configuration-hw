package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService
            = (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie mortalKombat = new Movie("Mortal Combat", "Fighting");
        Movie theShawshankRedemption = new Movie("The Shawshank Redemption", "Prison");
        movieService.add(mortalKombat);
        movieService.add(theShawshankRedemption);
        System.out.println(movieService.get(mortalKombat.getId()));
        System.out.println(movieService.get(theShawshankRedemption.getId()));
    }
}
