package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Titanic");
        movie.setDescription("""
                Titanic was built in Belfast, Northern Ireland by Harland
                & Wolff for transatlantic passage between Southampton, England
                and New York City. It Was largest and most luxury passenger ship
                of its time was reported to be unsinkable.
                """);
        movieService.add(movie);
        movieService.get(movie.getId());
    }
}
