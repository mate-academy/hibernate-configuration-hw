package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Taxi-2");
        movie.setDescription("Taxi-2, Luk Besson");

        Movie add = movieService.add(movie);
        System.out.println(add);
        System.out.println(movieService.get(1L));
    }
}
