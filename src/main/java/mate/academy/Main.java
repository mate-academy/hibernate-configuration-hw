package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = new MovieServiceImpl();
        Movie movie = new Movie();
        movie.setTitle("John Wick 4");
        movie.setDescription("#3 was better");

        System.out.println(movieService.add(movie));
        System.out.println(movieService.get(1L));
    }
}
