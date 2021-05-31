package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService = (MovieService) injector
            .getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setTitle("Shawshank redemption");
        movie1.setDescription("Prison drama");
        Movie movie2 = new Movie();
        movie2.setTitle("Die hard");
        movie2.setDescription("Police and hostages drama with action");
        movieService.add(movie1);
        movieService.add(movie2);
        System.out.println(movieService.get(movie1.getId()));
        System.out.println(movieService.get(movie2.getId()));
    }
}
