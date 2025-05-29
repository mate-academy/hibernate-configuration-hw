package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Clean Code");
        movie.setDescription("A Handbook of Agile Software Craftsmanship");

        System.out.println(movieService.add(movie));
        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
    }
}
