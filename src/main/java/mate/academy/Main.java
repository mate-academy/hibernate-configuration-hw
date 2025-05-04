package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.services.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie1 = new Movie("My movie", "Very interesting movie");
        System.out.println("movie1 : " + movie1);

        Movie addedMovie1 = movieService.add(movie1);
        System.out.println(addedMovie1);

        Movie movie2 = new Movie("Another movie", "Some documental movie");
        System.out.println("movie2 : " + movie2);

        Movie addedMovie2 = movieService.add(movie2);
        System.out.println(addedMovie2);

        Movie movieWithId1 = movieService.get(1L);
        System.out.println("moviemovieWithId1: " + movieWithId1);

        Movie movieWithId3 = movieService.get(3L);
        System.out.println("moviemovieWithId3: " + movieWithId3);

    }
}
