package mate.academy;

import mate.academy.lib.Inject;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy.dao");

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setTitle("movie1");
        movie1.setDescription("This is movie #1");
        Movie movie2 = new Movie();
        movie2.setTitle("movie2");
        movie2.setDescription("This is movie #2");
        @Inject
        MovieService movieService = null;
        movieService.add(movie1);
        movieService.add(movie2);
        System.out.println(movieService.get(2L));
    }
}
