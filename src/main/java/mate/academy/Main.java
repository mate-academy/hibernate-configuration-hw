package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Vikings");
        movie.setDescription("Interesting movie about viking's hard and funny life");
        Movie add = movieService.add(movie);
        Movie get = movieService.get(movie.getId());
        System.out.println(add.equals(get));
    }
}
