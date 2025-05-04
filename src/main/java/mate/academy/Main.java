package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setTitle("Rangers");
        movie1.setDescription("Power ranges");

        Movie movie2 = new Movie();
        movie2.setTitle("Game of throne");
        movie2.setDescription("Life is game");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(movie1);
        movieService.add(movie2);

        System.out.println(movieService.get(1L));
    }
}
