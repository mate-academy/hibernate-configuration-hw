package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Shrek Forever After");
        movie.setDescription("movie i'm about to rewatch after i'm done with this task");
        System.out.println(movieService.add(movie));
        System.out.println(movieService.get(movie.getId()));
    }
}
