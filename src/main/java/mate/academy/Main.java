package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        movieService.add(new Movie("Shrek","Very funny movie about ogre"));
        movieService.add(new Movie("Mad Max","He's Max and he's MAD"));
        movieService.add(new Movie("Scary Movie 2","Unbelievably scary movie"));
        Movie movie = movieService.get(1L);
        Movie movie1 = movieService.get(3L);
    }
}
