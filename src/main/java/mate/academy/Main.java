package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie firstMovie = new Movie();
        firstMovie.setTitle("The Hobbit");
        firstMovie.setDescription("Adventures of the hobbit");
        Movie secondMovie = new Movie();
        secondMovie.setTitle("Star Wars");
        secondMovie.setDescription("Luke! I am your father!");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        movieService.add(firstMovie);
        movieService.add(secondMovie);

        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
    }
}
