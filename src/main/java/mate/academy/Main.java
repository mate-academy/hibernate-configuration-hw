package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie("Interstellar", "People and Corn");
        System.out.println("Add movie - " + movieService.add(movie));
        System.out.println("Get by Id movie - " + movieService.get(1L));
    }
}
