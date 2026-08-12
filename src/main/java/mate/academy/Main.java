package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");

        Movie movie = new Movie();
        movie.setDescription("Description");
        movie.setTitle("Title");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        movie = movieService.add(movie);
        System.out.println(movie);

        System.out.println(movieService.get(1L));

    }
}
