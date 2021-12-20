package mate;

import mate.lib.Injector;
import mate.model.Movie;
import mate.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate");
        MovieService movieService = (MovieService) injector
                .getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Spider-Man: No Way Home");
        movie.setDescription("One of the best movie in 2021");
        movieService.add(movie);
        System.out.println(movieService.get(movie.getId()));
    }
}
