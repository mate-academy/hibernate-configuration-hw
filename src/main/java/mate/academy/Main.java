package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie matrix = new Movie();
        matrix.setTitle("Matrix");
        matrix.setDescription("4th part is coming!!!");
        movieService.add(matrix);

        Movie matrixByID = movieService.get(matrix.getId());
        System.out.println(matrixByID);
    }
}
