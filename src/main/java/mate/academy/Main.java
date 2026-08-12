package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movieFirst = new Movie();
        movieFirst.setTitle("The kingdom of heaven");
        movieFirst.setDescription("Interesting movie");

        MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);

        movieService.add(movieFirst);
        System.out.println(movieFirst);

        Movie movieFromDb = movieService.get(1L);
        System.out.println(movieFromDb);
    }
}
