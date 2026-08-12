package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    private static final MovieService movieService
            = (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        //ADD
        Movie movie = new Movie();
        movie.setTitle("Spider Man");
        movie.setDescription("Classic superhero");
        System.out.println("ADD");
        System.out.println(movie = movieService.add(movie));

        //GET
        System.out.println("GET");
        System.out.println(movieService.get(movie.getId()));
    }
}
