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
        firstMovie.setTitle("Title of first movie");
        firstMovie.setDescription("The description of first movie!");
        Movie secondMovie = new Movie();
        secondMovie.setTitle("Title of second movie");
        secondMovie.setDescription("The description of second movie!");
        movieService.add(firstMovie);
        movieService.add(secondMovie);
        System.out.println(movieService.get(2L));
        System.out.println(movieService.get(1L));
    }
}
