package mate.academy;

import mate.academy.entity.Movie;
import mate.academy.lib.Injector;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieServiceImpl movieService = (MovieServiceImpl) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("The pirates of the Caribbean");
        movie.setDescription("Fantasy");
        movieService.add(movie);
        System.out.println(movieService.get(1L));
    }
}
