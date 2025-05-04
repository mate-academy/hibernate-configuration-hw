package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieServiceImpl = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Terminator 5");
        movie.setDescription("Awesome movie");

        movieServiceImpl.add(movie);
        System.out.println(movieServiceImpl.get(movie.getId()));
    }
}
