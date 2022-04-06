package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie avengers = new Movie();
        avengers.setTitle("Avengers");
        movieService.add(avengers);
        System.out.println("movie1 added");
        Movie potter = new Movie();
        potter.setTitle("Potter");
        movieService.add(potter);
        System.out.println("movie2 added");
        System.out.println(movieService.get(avengers.getId()));
        System.out.println(movieService.get(potter.getId()));
    }
}
