package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie firstMovie = new Movie();
        firstMovie.setTitle("The boys");
        firstMovie.setDescription("Cool movie");

        Movie secondMovie = new Movie();
        secondMovie.setTitle("Fast and Furious");
        secondMovie.setDescription("Stupid movie");

        System.out.println(movieService.add(firstMovie));
        System.out.println(movieService.add(secondMovie));
        System.out.println(movieService.get(firstMovie.getId()));
    }
}
