package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector
                .getInstance(MovieService.class);
        Movie harry = new Movie();
        harry.setTitle("Harry Potter and the Philosopher's stone");
        harry.setDescription("Fantasy, Adventures, Action");
        movieService.add(harry);
        System.out.println(movieService.get(harry.getId()));
    }
}
