package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("A beautiful mind");
        movie.setDescription("Biographical film.");
        movieService.add(movie);
        Movie getMovie = movieService.get(1L);
        System.out.println(movie);
        System.out.println(getMovie);
    }
}
