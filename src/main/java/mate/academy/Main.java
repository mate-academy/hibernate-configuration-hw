package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie1 = new Movie("Terminator 555", "Awesome movie");
        Movie movie2 = new Movie("Terminator 128", "Very awesome movie");
        System.out.println("Movies before saving in DB");
        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println();
        movieService.add(movie1);
        movieService.add(movie2);
        System.out.println("Movies after saving in DB");
        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println();
        movie1 = movieService.get(1L);
        movie2 = movieService.get(2L);
        System.out.println("Movies read from DB");
        System.out.println(movie1);
        System.out.println(movie2);
    }
}
