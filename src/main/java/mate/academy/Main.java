package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Fast and Fast");

        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        movieService.add(movie);
        System.out.println(movieService.get(Long.valueOf(1L)));
    }
}
