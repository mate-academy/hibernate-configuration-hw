package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService)
                injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Title");
        movie.setDescription("Descr");
        Movie saved = movieService.add(movie);
        System.out.println(saved);
        saved = movieService.get(1L);
        System.out.println(saved);
    }
}
