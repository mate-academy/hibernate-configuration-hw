package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {

    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {

        Movie movie = new Movie();

        movie.setTitle("Titanic 3");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(movie);

        Movie movie1 = movieService.get(1L);

        System.out.println(movie1.toString());

    }
}
