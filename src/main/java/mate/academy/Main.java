package mate.academy;

import mate.academy.Service.MovieService;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;

public class Main {
    public static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Evangelion 3.0+1.0");
        movie.setDescription("The last rebuild of Evangelion");

        movieService.add(movie);
        Movie movieFromDB = movieService.get(movie.getId());
        System.out.println(movieFromDB);
    }
}
