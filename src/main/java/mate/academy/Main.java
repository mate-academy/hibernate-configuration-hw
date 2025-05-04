package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setTitle("Avengers");
        movie1.setDescription("Avengers Assemble!");

        Movie movie2 = new Movie();
        movie2.setTitle("Star Wars");
        movie2.setDescription("May the force be with you.");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(movie1);
        movieService.add(movie2);

        System.out.println(movieService.get(1L));
    }
}
