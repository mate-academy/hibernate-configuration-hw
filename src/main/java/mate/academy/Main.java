package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie firstMovie = new Movie();
        Movie secondMovie = new Movie();
        firstMovie.setTitle("firstTitle");
        secondMovie.setTitle("secondTitle");
        firstMovie.setDescription("firstDesc");
        secondMovie.setDescription("secondDesc");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(firstMovie);
        movieService.add(secondMovie);
        System.out.println(movieService.get(2L));
        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(3L));

    }
}
