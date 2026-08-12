package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie1 = new Movie();

        movie1.setTitle("Taxi 7");
        movie1.setDescription("Very interesting movie");
        movieService.add(movie1);

        Movie movie2 = new Movie();
        movie2.setTitle("Harry Potter");
        movie2.setDescription("Best of the best movie");
        movieService.add(movie2);
        System.out.println(movieService.get(movie2.getId()));
    }
}
