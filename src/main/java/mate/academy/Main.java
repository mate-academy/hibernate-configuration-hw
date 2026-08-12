package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {

    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Riddikc");
        movie.setDescription("Adventure movie");
        movieService.add(movie);
        System.out.println(movie);
        Movie twelve = new Movie();
        twelve.setTitle("Ocean's Twelve");
        twelve.setDescription("Criminal");
        movieService.add(twelve);
        System.out.println(twelve);
        System.out.println(movieService.get(movie.getId()));
        System.out.println(movieService.get(twelve.getId()));
    }
}

