package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie intouchablesMovie = new Movie();
        intouchablesMovie.setTitle("Intouchables");
        intouchablesMovie.setDescription("Awesome movie");

        Movie theGreenMile = new Movie();
        theGreenMile.setTitle("The Green Mile");
        theGreenMile.setDescription("Awesome movie");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        System.out.println("_______add_movie_________");
        movieService.add(intouchablesMovie);
        movieService.add(theGreenMile);

        System.out.println("_______get_movie_by_id_________");
        System.out.println(movieService.get(intouchablesMovie.getId()));
        System.out.println(movieService.get(theGreenMile.getId()));
    }
}
