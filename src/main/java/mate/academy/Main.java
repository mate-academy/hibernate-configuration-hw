package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie theLordOfTheRings = new Movie();
        theLordOfTheRings.setTitle("The Lord of the Rings");
        theLordOfTheRings.setDescription("adventure and fantasy");
        Movie firstMovie = movieService.add(theLordOfTheRings);
        System.out.println(firstMovie);

        Movie harryPotter = new Movie();
        harryPotter.setTitle("The Philosopher's Stone");
        harryPotter.setDescription("fantasy");
        Movie secondMovie = movieService.add(harryPotter);
        System.out.println(secondMovie);

        Movie getMovieById = movieService.get(1L);
        System.out.println("----------------");
        System.out.println(getMovieById);
    }
}
