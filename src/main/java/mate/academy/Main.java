package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("7 Mile");
        movie.setDescription("Awesome movie");
        movie = movieService.add(movie);
        System.out.println(movie.getId());
        System.out.println(movieService.get(1L));
    }
}
