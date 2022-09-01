package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Titanic");
        movie.setDescription("Titanic is a 1997 American epic romantic disaster movie.");
        movieService.add(movie);
        System.out.println(movieService.get(1L));
    }
}
