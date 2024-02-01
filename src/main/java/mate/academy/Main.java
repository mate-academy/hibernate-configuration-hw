package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movieOne = new Movie();
        movieOne.setTitle("LOST");
        movieOne.setDescription("7.7/10");
        movieService.add(movieOne);
        movieService.get(1L);

        Movie movieTwo = new Movie();
        movieOne.setTitle("Green apples");
        movieOne.setDescription("6.9/10");
        movieService.add(movieTwo);
        movieService.get(2L);

        Movie movieThree = new Movie();
        movieOne.setTitle("For All Mankind");
        movieOne.setDescription("8.7/10");
        movieService.add(movieThree);
        movieService.get(3L);
    }
}
