package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.services.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        //testing save
        Movie movie = new Movie();
        movie.setTitle("Harry Potter");
        movieService.add(movie);

        //testing get
        System.out.println(movieService.get(movie.getId()));
    }
}
