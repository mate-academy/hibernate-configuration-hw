package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        final MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movieDune = new Movie();
        movieDune.setTitle("Dune");
        movieDune.setDescription("Epic science fiction film ");
        movieService.add(movieDune);

        Movie moviePawPatrol = new Movie();
        moviePawPatrol.setTitle("Paw Patrol");
        moviePawPatrol.setDescription("Movie for children");
        movieService.add(moviePawPatrol);

        Movie movieFromDB = movieService.get(1L);
        System.out.println(movieFromDB);

    }
}
