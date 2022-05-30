package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static MovieService movieService
            = (MovieService) injector.getInstance(MovieService.class);
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setTitle("Morbius");
        movie1.setDescription("It's Morbing Time");
        Movie movie2 = new Movie();
        movie2.setTitle("Garfield");
        movie2.setDescription("I hate Mondays");
        movieService.add(movie1);
        movieService.add(movie2);
        System.out.println(movieService.get(movie2.getId()));
    }
}
