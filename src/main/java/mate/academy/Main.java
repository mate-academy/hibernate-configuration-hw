package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate");
        MovieService service = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Lord of the rings");
        movie.setDescription("great movie");

        System.out.println("Method add was called: " + service.add(movie));
        System.out.println("Method get was called: " + service.get(movie.getId()));
    }
}
