package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie firstMovie = new Movie("Avengers", "Superhero movie");
        movieService.add(firstMovie);
        System.out.println(movieService.get(firstMovie.getId()));

        Movie secondMovie = new Movie("Sponge Bob", "Funny cartoon");
        movieService.add(secondMovie);
        System.out.println(movieService.get(secondMovie.getId()));
    }
}
