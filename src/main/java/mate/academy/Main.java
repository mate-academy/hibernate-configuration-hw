package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        movieService.add(new Movie("Spider-Man: There's no way home",
                "blockbuster of the year"));
        movieService.add(new Movie("Doctor Strange in the Multiverse is insane",
                "From Spider-Man director: Sam Raimi"));
        movieService.add(new Movie("Avatar 2 path of water",
                "Director: James Cameron"));
        movieService.add(new Movie("Top Gun Maverick",
                "Tom Cruise returns to the role of the best pilot"));
        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
        System.out.println(movieService.get(3L));
        System.out.println(movieService.get(4L));
    }
}
