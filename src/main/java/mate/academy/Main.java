package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
    public static void main(String[] args) {
        Movie movieFG = new Movie();
        movieFG.setTitle("Forest Gump");
        movieFG.setDescription("Alabama man , whose only desire is to be reunited with his childhood sweetheart.");
        movieService.add(movieFG);

        Movie movieSR = new Movie();
        movieSR.setTitle("The Shawshank Redemption");
        movieSR.setDescription("Two imprisoned men bond over a number of years");
        movieService.add(movieSR);

        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
    }
}