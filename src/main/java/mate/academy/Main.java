package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Superman 20");
        movie.setDescription("Some description");
        System.out.println("Movie " + movieService.add(movie)
                + " was successfully added");
        System.out.println("Get movie: " + movieService.get(movie.getId()));
    }
}
