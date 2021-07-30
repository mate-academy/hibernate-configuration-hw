package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie matrixOne = new Movie();
        matrixOne.setTitle("The Matrix 1");
        movieService.add(matrixOne);
        System.out.println(matrixOne);
        System.out.println(movieService.get(matrixOne.getId()));

        Movie matrixTwo = new Movie();
        matrixTwo.setDescription("Another part of The Matrix");
        matrixTwo.setTitle("The Matrix 2");
        movieService.add(matrixTwo);
        System.out.println(matrixTwo);
        System.out.println(movieService.get(matrixTwo.getId()));
    }
}
