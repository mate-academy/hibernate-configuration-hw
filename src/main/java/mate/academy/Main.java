package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setTitle("Terminator 2");
        movie1.setDescription("The only and the lonely credible!");
        movieService.add(movie1);
        Movie movie2 = new Movie();
        movie2.setTitle("Insider");
        movie2.setDescription("Quite good one!");
        movieService.add(movie2);
        Movie movieToGet = movieService.get(2L);
        System.out.println(movieToGet);
    }
}
