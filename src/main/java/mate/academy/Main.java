package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        Movie movie = new Movie();
        movie.setId(11L);
        movie.setTitle("Mission Impossible");
        movie.setDescription("Save the planet with Tom Cruse");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(movie);
        System.out.println(movieService.get(1L));
    }
}
