package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector instance = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) instance.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("The Founder");
        movieService.add(movie);
        System.out.println(movieService.get(1L));
    }
}
