package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        final MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie it = new Movie();
        it.setTitle("IT: 1987");
        it.setDescription("Movie about Clown");

        Movie it2 = new Movie();
        it2.setTitle("IT: 2017");
        it2.setDescription("New movie about Clown");

        Movie added1 = movieService.add(it);

        Movie added2 = movieService.add(it2);

        Movie movie = movieService.get(added2.getId());

        System.out.println("movie = " + movie);
    }
}
