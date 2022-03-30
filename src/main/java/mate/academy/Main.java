package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Lord of rings");
        movie.setDescription("Awesome movie");
        System.out.println("Adding movie:");
        movie = movieService.add(movie);
        System.out.println(movie);
        System.out.println("Movie was added.");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println("Get movie by id: " + movie.getId());
        System.out.println(movieService.get(movie.getId()));
    }
}
