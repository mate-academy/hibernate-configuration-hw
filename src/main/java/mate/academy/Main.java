package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie terminator = new Movie();
        terminator.setTitle("Terminator");
        terminator.setDescription("Classic movie from 1984.");
        terminator = movieService.add(terminator);
        System.out.println(terminator.getId());
        System.out.println(movieService.get(1L));
    }
}
