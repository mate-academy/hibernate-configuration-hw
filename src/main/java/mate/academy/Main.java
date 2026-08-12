package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie firstMovie = new Movie();
        firstMovie.setTitle("Rambo");
        firstMovie.setDescription("Stalone in main role");
        Movie secondMovie = new Movie();
        secondMovie.setTitle("Super Mutant Ninja Turles");
        secondMovie.setDescription("Mickelangelo, Raphael, Donatello");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        System.out.println(movieService.add(firstMovie));
        System.out.println(movieService.add(secondMovie));

        System.out.println(movieService.get(2L));
        System.out.println(movieService.get(1L));

    }
}
