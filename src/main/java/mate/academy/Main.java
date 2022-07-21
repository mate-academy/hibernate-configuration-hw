package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movieTenet = new Movie();
        movieTenet.setTitle("Tenet");
        movieTenet.setDescription("Awesome mind blowing SCIFI movie!");
        movieTenet = movieService.add(movieTenet);
        Movie movieFromDb = movieService.get(1L);
        System.out.println(movieFromDb);
        System.out.println(movieService.get(2L));
    }
}
