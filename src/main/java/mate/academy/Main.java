package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie1 = new Movie();
        movie1.setTitle("Fast and Furious 9");
        movie1.setDescription("Awesome movie");
        movieService.add(movie1);

        Movie movie2 = new Movie();
        movie2.setTitle("Terminator 5");
        movieService.add(movie2);

        Movie movieFromDB1 = movieService.get(1L);
        System.out.println(movieFromDB1);
        Movie movieFromDB2 = movieService.get(2L);
        System.out.println(movieFromDB2);
    }
}
