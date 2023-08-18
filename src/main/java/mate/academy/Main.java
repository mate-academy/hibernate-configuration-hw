package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector
            = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Harley Davidson and the Marlboro Man");
        movie.setDescription("Classic");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        System.out.println("***Add new Movie***");
        System.out.println(movieService.add(movie));

        System.out.println("***Get Movie by id***");
        System.out.println(movieService.get(1L));
    }
}
